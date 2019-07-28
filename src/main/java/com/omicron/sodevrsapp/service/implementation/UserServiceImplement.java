package com.omicron.sodevrsapp.service.implementation;

import java.util.ArrayList;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.omicron.sodevrsapp.entity.AdresseEntity;
import com.omicron.sodevrsapp.entity.AnnonceurEntity;
import com.omicron.sodevrsapp.entity.GeoLocalisationEntity;
import com.omicron.sodevrsapp.entity.ParticulierEntity;
import com.omicron.sodevrsapp.entity.ProfessionnelEntity;
import com.omicron.sodevrsapp.exception.EmptyAddressException;
import com.omicron.sodevrsapp.exception.EmptyGeoLocationException;
import com.omicron.sodevrsapp.exception.EmptyPsudoException;
import com.omicron.sodevrsapp.exception.InvalidUserDataException;
import com.omicron.sodevrsapp.exception.UserAlreadyExistsException;
import com.omicron.sodevrsapp.repositories.AdresseRepository;
import com.omicron.sodevrsapp.repositories.AnnonceurRepository;
import com.omicron.sodevrsapp.repositories.GeolocalisationRepository;
import com.omicron.sodevrsapp.repositories.ParticulierRepository;
import com.omicron.sodevrsapp.repositories.ProfessionnelRepository;
import com.omicron.sodevrsapp.service.UserService;
import com.omicron.sodevrsapp.shared.Utils;
import com.omicron.sodevrsapp.shared.dto.ProUserDto;
import com.omicron.sodevrsapp.shared.dto.UserDto;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Service
public class UserServiceImplement implements UserService {

	@Autowired
	AnnonceurRepository annonceurRepository;
	@Autowired
	ParticulierRepository particulierRepository;
	@Autowired
	ProfessionnelRepository professionnelRepository;
	@Autowired
	AdresseRepository adresseRepository;
	@Autowired
	GeolocalisationRepository geolocalisationRepository;
	@Autowired
	Utils utils;
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	String generatedUserId ;
	
	@Override
	public UserDto createUser(UserDto userDto) {
				
		if(particulierRepository.findUserByEmail(userDto.getEmail()) != null)
				throw new UserAlreadyExistsException("this user already exists");
		
		if(verifyUserData(userDto)) {
			
			ParticulierEntity particulierEntity = new ParticulierEntity();
			BeanUtils.copyProperties(userDto, particulierEntity);
			
			AdresseEntity a = null;
			if(!(particulierEntity.getAdresse().getPays() == null && particulierEntity.getAdresse().getQuartier() == null && particulierEntity.getAdresse().getVille() == null))
			a = adresseRepository.save(particulierEntity.getAdresse());
			
			
			GeoLocalisationEntity g = null;
			if(!(particulierEntity.getGeoLocalisation().getLatitude() == 0 && particulierEntity.getGeoLocalisation().getLongitude()==0))
				g = geolocalisationRepository.save(particulierEntity.getGeoLocalisation());
			
			generatedUserId = utils.generateUserId(30);
			
			particulierEntity.setAdresse(a);
			particulierEntity.setGeoLocalisation(g);
			particulierEntity.setEncryptedPassword(bCryptPasswordEncoder.encode(userDto.getPassword()));
			particulierEntity.setUserId(generatedUserId);
			
			ParticulierEntity storedUser = particulierRepository.save(particulierEntity);
			
			UserDto responseUserDto = new UserDto();
			BeanUtils.copyProperties(storedUser, responseUserDto);
					
			return responseUserDto;
		}else {
			throw new InvalidUserDataException("these fields \"nom ,email,telephone,password\" are required ");
		}
	}
	
	@Override
	public ProUserDto createUser(ProUserDto userDto) {
		
		if(verifyUserData(userDto)) {
			ProfessionnelEntity professionnelEntity = new ProfessionnelEntity();
			BeanUtils.copyProperties(userDto, professionnelEntity);
			
			AdresseEntity a = null;
			if(professionnelEntity.getAdresse().getPays() != null && professionnelEntity.getAdresse().getQuartier() != null && professionnelEntity.getAdresse().getVille() != null)
				a = adresseRepository.save(professionnelEntity.getAdresse());
			else
				throw new EmptyAddressException("All adresse fields are empty !");
			
			
			GeoLocalisationEntity g = null;
			// TODO change requirement to geoLocation required
			if(professionnelEntity.getGeoLocalisation().getLatitude() != 0 && professionnelEntity.getGeoLocalisation().getLongitude()!=0)
				g = geolocalisationRepository.save(professionnelEntity.getGeoLocalisation());
			else 
				throw new EmptyGeoLocationException("Longitude and latitude are required");
			
			//TODO verify psudo if is null
			if(professionnelEntity.getPsudo() == null || professionnelEntity.getPsudo().trim().isEmpty())
				throw new EmptyPsudoException("psudo name is null or empty");
			
			generatedUserId = utils.generateUserId(40);
			
			professionnelEntity.setAdresse(a);
			professionnelEntity.setGeoLocalisation(g);
			professionnelEntity.setEncryptedPassword(bCryptPasswordEncoder.encode(userDto.getPassword()));
			professionnelEntity.setUserId(generatedUserId);
			
			ProfessionnelEntity storedUser = professionnelRepository.save(professionnelEntity);
			
			ProUserDto responseUserDto = new ProUserDto();
			BeanUtils.copyProperties(storedUser, responseUserDto);
					
			return responseUserDto;
		}
		else {
			throw new InvalidUserDataException("these fields \"nom ,email,telephone,password\" are required ");
		}
	}
	
	
	private boolean verifyUserData(UserDto userDto) {
		
		if(userDto.getNom()==null || userDto.getNom().trim().isEmpty() )
			return false;
		
		if(userDto.getEmail()==null || userDto.getEmail().trim().isEmpty())
			return false;
		
		if(userDto.getTelephone()==null || userDto.getTelephone().trim().isEmpty())
			return false;
		
		if(userDto.getPassword()==null || userDto.getPassword().trim().isEmpty())
			return false;
		
		return true;
		
	}

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		AnnonceurEntity annonceur = annonceurRepository.findUserByEmail(email);
		
		if(annonceur == null) throw new UsernameNotFoundException("user email not exists");
		return new User(annonceur.getEmail(),annonceur.getEncryptedPassword(),new ArrayList<>());
	}

	@Override
	public UserDto getUserByEmail(String email) {
		AnnonceurEntity annonceur = annonceurRepository.findUserByEmail(email);

		if(annonceur == null) throw new UsernameNotFoundException("user email not exists");

		UserDto userDto = annonceur instanceof ParticulierEntity ? new UserDto():new ProUserDto();

		BeanUtils.copyProperties(annonceur, userDto);	
		
		return userDto;
	}

	@Override
	public UserDto getUserByUserId(String userId) {
		AnnonceurEntity annonceur = annonceurRepository.findUserByUserId(userId);
		if(annonceur == null) throw new UsernameNotFoundException(userId);

		UserDto userDto = annonceur instanceof ParticulierEntity ? new UserDto():new ProUserDto();

		BeanUtils.copyProperties(annonceur, userDto);

		return userDto;
	}

	@Override
	public ProUserDto updateUser(String userId,ProUserDto proUserDto) {

		AnnonceurEntity annonceur = annonceurRepository.findUserByUserId(userId);
		if(annonceur == null) throw new UsernameNotFoundException(userId);

		annonceur.setNom(proUserDto.getNom());
		annonceur.setTelephone(proUserDto.getTelephone());

		annonceurRepository.save(annonceur);

		ProUserDto mProUserDto = new ProUserDto();

		BeanUtils.copyProperties(annonceur, mProUserDto);

		return mProUserDto;
	}

	@Override
	public UserDto updateUser(String userId,UserDto userDto) {
		AnnonceurEntity annonceur = annonceurRepository.findUserByUserId(userId);
		if(annonceur == null) throw new UsernameNotFoundException(userId);

		annonceur.setNom(userDto.getNom());
		annonceur.setTelephone(userDto.getTelephone());

		annonceurRepository.save(annonceur);

		UserDto mUserDto = new UserDto();

		BeanUtils.copyProperties(annonceur, mUserDto);

		return mUserDto;
	}
}
