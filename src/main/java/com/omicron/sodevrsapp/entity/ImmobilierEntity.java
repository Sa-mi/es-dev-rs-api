package com.omicron.sodevrsapp.entity;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class ImmobilierEntity extends ProduitEntity {

	@Column
	private String natureImmobilier;
	@Column
	private String superficie;
	
	@ManyToOne(targetEntity = AdresseEntity.class,cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "idAdresse")
	private AdresseEntity adresse;
	
	@ManyToOne(targetEntity = GeoLocalisationEntity.class,cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "idGeoLocalisation")
	private GeoLocalisationEntity geoLocalisation;

	public ImmobilierEntity(Long id, String titre, String descriptif, double prix, boolean negociable,
			CategorieEntity categorie, String natureImmobilier, String superficie, AdresseEntity adresse,
			GeoLocalisationEntity geoLocalisation) {
		super(id, titre, descriptif, prix, negociable, categorie);
		this.natureImmobilier = natureImmobilier;
		this.superficie = superficie;
		this.adresse = adresse;
		this.geoLocalisation = geoLocalisation;
	}
	
	public String getNatureImmobilier() {
		return natureImmobilier;
	}
	public void setNatureImmobilier(String natureImmobilier) {
		this.natureImmobilier = natureImmobilier;
	}
	public String getSuperficie() {
		return superficie;
	}
	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}
	public AdresseEntity getAdresse() {
		return adresse;
	}
	public void setAdresse(AdresseEntity adresse) {
		this.adresse = adresse;
	}
	public GeoLocalisationEntity getGeoLocalisation() {
		return geoLocalisation;
	}
	public void setGeoLocalisation(GeoLocalisationEntity geoLocalisation) {
		this.geoLocalisation = geoLocalisation;
	} 
	
	
}
