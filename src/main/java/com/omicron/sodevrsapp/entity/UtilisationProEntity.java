package com.omicron.sodevrsapp.entity;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class UtilisationProEntity extends VehiculeMotoriseEntity {

	@Column(nullable = true,name="typeUtilisation")
	private String typeUtilisation;
	@Column(nullable = true,name="carrosserie")
	private String carrosserie;
	
	
	
	public UtilisationProEntity(Long id, String titre, String descriptif, double prix, boolean negociable,
			CategorieEntity categorie, String marque, String modele, String km,
			String anneeMiseSirculation, String carburant, String typeUtilisation, String carrosserie) {
		super(id, titre, descriptif, prix, negociable, categorie, marque, modele, km, anneeMiseSirculation,
				carburant);
		this.typeUtilisation = typeUtilisation;
		this.carrosserie = carrosserie;
	}
	public String getTypeUtilisation() {
		return typeUtilisation;
	}
	public void setTypeUtilisation(String typeUtilisation) {
		this.typeUtilisation = typeUtilisation;
	}
	public String getCarrosserie() {
		return carrosserie;
	}
	public void setCarrosserie(String carrosserie) {
		this.carrosserie = carrosserie;
	}
	
	
}
