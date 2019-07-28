package com.omicron.sodevrsapp.ui.model.request;

import com.omicron.sodevrsapp.entity.GeoLocalisationEntity;
import com.omicron.sodevrsapp.entity.AdresseEntity;

public class UserRequestModel extends AnnonceurRequestModel {
	
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
