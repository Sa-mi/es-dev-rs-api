package com.omicron.sodevrsapp.entity;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class VillaEntity extends ImmobilierEntity {

	@Column(name = "anciennteVilla")
	private int anciennete;
	@Column(name = "uniteAnciennteVilla")
	private String uniteAnciennte;
	@Column(name = "uniteAnciennte")
	private int nbrChambres;
	
	//TODO
	private String superficieTerrain;
	private boolean jardin;
	private boolean piscine;
	private boolean cave;
	public VillaEntity(Long id, String titre, String descriptif, double prix, boolean negociable,
			CategorieEntity categorie, String natureImmobilier, String superficie, AdresseEntity adresse,
			GeoLocalisationEntity geoLocalisation, int anciennete, String uniteAnciennte, int nbrChambres,
			String superficieTerrain, boolean jardin, boolean piscine, boolean cave) {
		super(id, titre, descriptif, prix, negociable, categorie, natureImmobilier, superficie, adresse,
				geoLocalisation);
		this.anciennete = anciennete;
		this.uniteAnciennte = uniteAnciennte;
		this.nbrChambres = nbrChambres;
		this.superficieTerrain = superficieTerrain;
		this.jardin = jardin;
		this.piscine = piscine;
		this.cave = cave;
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
	public String getSuperficieTerrain() {
		return superficieTerrain;
	}
	public void setSuperficieTerrain(String superficieTerrain) {
		this.superficieTerrain = superficieTerrain;
	}
	public boolean isJardin() {
		return jardin;
	}
	public void setJardin(boolean jardin) {
		this.jardin = jardin;
	}
	public boolean isPiscine() {
		return piscine;
	}
	public void setPiscine(boolean piscine) {
		this.piscine = piscine;
	}
	public boolean isCave() {
		return cave;
	}
	public void setCave(boolean cave) {
		this.cave = cave;
	}
	
	
}
