package com.omicron.sodevrsapp.entity;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class MotoEntity extends VehiculeMotoriseEntity {
	@Column(nullable = true,name="cylindre",length = 50)
	private String cylindre;

	

	public MotoEntity(Long id, String titre, String descriptif, double prix, boolean negociable, 
			CategorieEntity categorie, String marque, String modele, String km, String anneeMiseSirculation, String carburant,
			String cylindre) {
		super(id, titre, descriptif, prix, negociable, categorie, marque, modele, km, anneeMiseSirculation,
				carburant);
		this.cylindre = cylindre;
	}

	public String getCylindre() {
		return cylindre;
	}

	public void setCylindre(String cylindre) {
		this.cylindre = cylindre;
	}
	
	
}
