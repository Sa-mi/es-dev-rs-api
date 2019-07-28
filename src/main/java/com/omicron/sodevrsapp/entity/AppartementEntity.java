package com.omicron.sodevrsapp.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class AppartementEntity extends ImmobilierEntity {
	
	@Column(name = "anciennteAppartement")
	private int anciennete;
	@Column(name = "uniteAnciennteAppartement")
	private String uniteAnciennte;
	@Column(name = "nbrChambres")
	private int nbrChambres;
	@Column
	private String etage;
	
	public AppartementEntity(Long id, String titre, String descriptif, double prix, boolean negociable,
			 CategorieEntity categorie, String natureImmobilier, String superficie, AdresseEntity adresse,
			GeoLocalisationEntity geoLocalisation, int anciennete, String uniteAnciennte, int nbrChambres, String etage) {
		super(id, titre, descriptif, prix, negociable, categorie, natureImmobilier, superficie, adresse,
				geoLocalisation);
		this.anciennete = anciennete;
		this.uniteAnciennte = uniteAnciennte;
		this.nbrChambres = nbrChambres;
		this.etage = etage;
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

	public int getNbrChambres() {
		return nbrChambres;
	}

	public void setNbrChambres(int nbrChambres) {
		this.nbrChambres = nbrChambres;
	}

	public String getEtage() {
		return etage;
	}

	public void setEtage(String etage) {
		this.etage = etage;
	}
	
	
	
	
}
