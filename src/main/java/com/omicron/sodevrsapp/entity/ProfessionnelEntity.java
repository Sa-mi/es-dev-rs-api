package com.omicron.sodevrsapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ProfessionnelEntity extends AnnonceurEntity {

	@Column
    private String psudo;
	
	@ManyToOne(targetEntity = AdresseEntity.class,cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "idAdresse")
	private AdresseEntity adresse;
	
	@ManyToOne(targetEntity = GeoLocalisationEntity.class,cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "idGeoLocalisation")
	private GeoLocalisationEntity geoLocalisation;

	public ProfessionnelEntity() {}
    public ProfessionnelEntity(int id, WishListEntity wishlist, String userId, String nom, String telephone,
			String email, String encryptedPassword, String psudo, AdresseEntity adresse,
			GeoLocalisationEntity geoLocalisation) {
		super(id, wishlist, userId, nom, telephone, email, encryptedPassword);
		this.psudo = psudo;
		this.adresse = adresse;
		this.geoLocalisation = geoLocalisation;
	}

	public String getPsudo() {
        return psudo;
    }

    public void setPsudo(String psudo) {
        this.psudo = psudo;
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
        if(geoLocalisation == null)
            throw new NullPointerException("geoLocalisation must not be null in Proffrsionnel users case");
        this.geoLocalisation = geoLocalisation;
    }
    
}
