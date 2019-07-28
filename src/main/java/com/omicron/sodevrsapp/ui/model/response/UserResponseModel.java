package com.omicron.sodevrsapp.ui.model.response;

import com.omicron.sodevrsapp.entity.AdresseEntity;
import com.omicron.sodevrsapp.entity.GeoLocalisationEntity;

public class UserResponseModel extends AnnonceurResponseModel {

	private GeoLocalisationEntity geoLocalisation;
	private AdresseEntity adresse;
	
	public GeoLocalisationEntity getGeoLocalisation() {
		return geoLocalisation;
	}
	public void setGeoLocalisation(GeoLocalisationEntity geoLocalisation) {
		this.geoLocalisation = geoLocalisation;
	}
	public AdresseEntity getAdresse() {
		return adresse;
	}
	public void setAdresse(AdresseEntity adresse) {
		this.adresse = adresse;
	}
	
	
}
