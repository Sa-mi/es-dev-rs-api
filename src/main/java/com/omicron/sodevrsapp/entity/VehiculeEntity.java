package com.omicron.sodevrsapp.entity;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class VehiculeEntity extends ProduitEntity {
	@Column(name="marqueVehicule")
	private String marque;

	

	public VehiculeEntity(Long id, String titre, String descriptif, double prix, boolean negociable,
			CategorieEntity categorie, String marque) {
		super(id, titre, descriptif, prix, negociable, categorie);
		this.marque = marque;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	
}
