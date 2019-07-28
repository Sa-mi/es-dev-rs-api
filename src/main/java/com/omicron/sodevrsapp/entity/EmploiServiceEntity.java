package com.omicron.sodevrsapp.entity;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class EmploiServiceEntity extends ProduitEntity {

	@Column
	private String typeContrat;
	@Column
	private String poste;
	@Column
	private String expertise;
	
	
	
	public EmploiServiceEntity(Long id, String titre, String descriptif, double prix, boolean negociable,
			CategorieEntity categorie, String typeContrat, String poste, String expertise) {
		super(id, titre, descriptif, prix, negociable, categorie);
		this.typeContrat = typeContrat;
		this.poste = poste;
		this.expertise = expertise;
	}
	public String getTypeContrat() {
		return typeContrat;
	}
	public void setTypeContrat(String typeContrat) {
		this.typeContrat = typeContrat;
	}
	public String getPoste() {
		return poste;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}
	public String getExpertise() {
		return expertise;
	}
	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}
	
	
}
