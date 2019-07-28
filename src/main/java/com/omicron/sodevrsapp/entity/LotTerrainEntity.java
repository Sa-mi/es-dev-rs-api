package com.omicron.sodevrsapp.entity;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class LotTerrainEntity extends ImmobilierEntity {

	@Column
	private boolean constructible;

	public LotTerrainEntity(Long id, String titre, String descriptif, double prix, boolean negociable,
			CategorieEntity categorie, String natureImmobilier, String superficie, AdresseEntity adresse,
			GeoLocalisationEntity geoLocalisation, boolean constructible) {
		super(id, titre, descriptif, prix, negociable, categorie, natureImmobilier, superficie, adresse,
				geoLocalisation);
		this.constructible = constructible;
	}

	public boolean isConstructible() {
		return constructible;
	}

	public void setConstructible(boolean constructible) {
		this.constructible = constructible;
	}
	
	
}
