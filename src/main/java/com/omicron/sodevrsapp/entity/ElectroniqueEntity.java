package com.omicron.sodevrsapp.entity;

import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class ElectroniqueEntity extends ProduitEntity {
	
	@Column(name="marqueElectro")
	private String marque;
	@Column(name="modeleElectro")
	private String modele;

	

	public ElectroniqueEntity(Long id, String titre, String descriptif, double prix, boolean negociable,
			CategorieEntity categorie, String marque, String modele) {
		super(id, titre, descriptif, prix, negociable, categorie);
		this.marque = marque;
		this.modele = modele;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

}
