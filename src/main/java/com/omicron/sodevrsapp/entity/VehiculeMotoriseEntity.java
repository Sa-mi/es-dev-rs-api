package com.omicron.sodevrsapp.entity;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class VehiculeMotoriseEntity extends VehiculeEntity {

	@Column(name="modeleVehicule")
	private String modele;
	@Column
	private String km;
	@Column
	private String anneeMiseSirculation;
	@Column
	private String carburant;
	
	
	
	public VehiculeMotoriseEntity(Long id, String titre, String descriptif, double prix, boolean negociable,
			 CategorieEntity categorie, String marque, String modele, String km,
			String anneeMiseSirculation, String carburant) {
		super(id, titre, descriptif, prix, negociable, categorie, marque);
		this.modele = modele;
		this.km = km;
		this.anneeMiseSirculation = anneeMiseSirculation;
		this.carburant = carburant;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getKm() {
		return km;
	}
	public void setKm(String km) {
		this.km = km;
	}
	public String getAnneeMiseSirculation() {
		return anneeMiseSirculation;
	}
	public void setAnneeMiseSirculation(String anneeMiseSirculation) {
		this.anneeMiseSirculation = anneeMiseSirculation;
	}
	public String getCarburant() {
		return carburant;
	}
	public void setCarburant(String carburant) {
		this.carburant = carburant;
	}
	
}
