package com.omicron.sodevrsapp.shared.dto;

import com.omicron.sodevrsapp.entity.AdresseEntity;
import com.omicron.sodevrsapp.entity.GeoLocalisationEntity;

public class UserDto extends AnnonceurDto {

	private AdresseEntity adresse;
	private GeoLocalisationEntity geoLocalisation;
	
	public AdresseEntity getAdresse() {
		return adresse;
	}
	public void setAdresse(AdresseEntity adresse) {
		this.adresse = adresse;
	}
	public GeoLocalisationEntity getGeoLocalisation() {
		return geoLocalisation;
	}
	public void setGeoLocalisation(GeoLocalisationEntity geoLocalisation) {
		this.geoLocalisation = geoLocalisation;
	}

}
