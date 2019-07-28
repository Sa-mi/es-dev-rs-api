package com.omicron.sodevrsapp.entity;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class VoitureEntity extends VehiculeMotoriseEntity {

	@Column
	private String typeVoiture;
	@Column
	private int puissanceFiscale;
	
	
	
	public VoitureEntity(Long id, String titre, String descriptif, double prix, boolean negociable,
			CategorieEntity categorie, String marque, String modele, String km, String anneeMiseSirculation, String carburant,
			String typeVoiture, int puissanceFiscale) {
		super(id, titre, descriptif, prix, negociable, categorie, marque, modele, km, anneeMiseSirculation,
				carburant);
		this.typeVoiture = typeVoiture;
		this.puissanceFiscale = puissanceFiscale;
	}
	public String getTypeVoiture() {
		return typeVoiture;
	}
	public void setTypeVoiture(String typeVoiture) {
		this.typeVoiture = typeVoiture;
	}
	public int getPuissanceFiscale() {
		return this.puissanceFiscale;
	}
	public void setPuissanceFiscale(int puissanceFiscale) {
		this.puissanceFiscale = puissanceFiscale;
	}
	
	
}
