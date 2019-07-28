package com.omicron.sodevrsapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ParticulierEntity extends AnnonceurEntity {

	@ManyToOne(targetEntity = AdresseEntity.class,cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "idAdresse")
	private AdresseEntity adresse;
	
	@ManyToOne(targetEntity = GeoLocalisationEntity.class,cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "idGeoLocalisation")
	private GeoLocalisationEntity geoLocalisation;

    
	public ParticulierEntity() {}
    public ParticulierEntity(int id, WishListEntity wishlist, String userId, String nom, String telephone, String email,
			String encryptedPassword, AdresseEntity adresse, GeoLocalisationEntity geoLocalisation) {
		super(id, wishlist, userId, nom, telephone, email, encryptedPassword);
		this.adresse = adresse;
		this.geoLocalisation = geoLocalisation;
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
