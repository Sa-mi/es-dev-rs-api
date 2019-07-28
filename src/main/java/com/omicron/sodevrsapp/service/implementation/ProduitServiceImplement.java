package com.omicron.sodevrsapp.service.implementation;

import java.util.ArrayList;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omicron.sodevrsapp.entity.ProduitEntity;
import com.omicron.sodevrsapp.entity.ProduitImagesEntity;
import com.omicron.sodevrsapp.repositories.ProduitImagesRepository;
import com.omicron.sodevrsapp.repositories.ProduitRepository;
import com.omicron.sodevrsapp.service.ProduitService;
import com.omicron.sodevrsapp.shared.dto.ProduitDto;

@Service
public class ProduitServiceImplement implements ProduitService {

	@Autowired
	ProduitRepository produitRepository;
	@Autowired
	ProduitImagesRepository produitImagesRepository;
	
	@Override
	public ProduitDto createProduit(ProduitDto produit) {
		
		ProduitEntity produitEntity = new ProduitEntity();
		BeanUtils.copyProperties(produit, produitEntity);
		
		ProduitEntity storedProduit = produitRepository.save(produitEntity);
		
		for(String url : produit.getImages()) {
			produitImagesRepository.save(new ProduitImagesEntity(1L, storedProduit,url));
		}
				
		
		ProduitDto returnValue = new ProduitDto();
		BeanUtils.copyProperties(storedProduit, returnValue);
		
		return returnValue;
	}

	@Override
	public ArrayList<ProduitDto> getAll() {
		Iterable<ProduitEntity> storedProduits = produitRepository.findAll();
		ArrayList<ProduitDto> returnValue = new ArrayList<ProduitDto>();
		
		while(storedProduits.iterator().hasNext()) {
			ProduitDto produitDto = new ProduitDto();
			BeanUtils.copyProperties(storedProduits.iterator().next(), produitDto);
			
			returnValue.add(produitDto);
		}
		return returnValue;
	}
	
	
	
}
