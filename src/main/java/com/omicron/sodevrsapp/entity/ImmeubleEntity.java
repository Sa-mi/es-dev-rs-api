package com.omicron.sodevrsapp.entity;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class ImmeubleEntity extends ImmobilierEntity {

	@Column(name = "anciennteImmeuble")
	private int anciennete;
	@Column(name = "uniteAnciennteImmeuble")
	private String uniteAnciennte;
	@Column
	private int nbrEtages;

	public ImmeubleEntity(Long id, String titre, String descriptif, double prix, boolean negociable,
			CategorieEntity categorie, String natureImmobilier, String superficie, AdresseEntity adresse,
			GeoLocalisationEntity geoLocalisation, int anciennete, String uniteAnciennte, int nbrEtages) {
		super(id, titre, descriptif, prix, negociable, categorie, natureImmobilier, superficie, adresse,
				geoLocalisation);
		this.anciennete = anciennete;
		this.uniteAnciennte = uniteAnciennte;
		this.nbrEtages = nbrEtages;
	}

	public int getAnciennete() {
		return anciennete;
	}

	public void setAnciennete(int anciennete) {
		this.anciennete = anciennete;
	}

	public String getUniteAnciennte() {
		return uniteAnciennte;
	}

	public void setUniteAnciennte(String uniteAnciennte) {
		this.uniteAnciennte = uniteAnciennte;
	}

	public int getNbrEtages() {
		return nbrEtages;
	}

	public void setNbrEtages(int nbrEtages) {
		this.nbrEtages = nbrEtages;
	}
	
	
}
