package com.omicron.sodevrsapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class VisiteurEntity extends UtilisateurEntity {
	
	
	@ManyToOne(targetEntity = GeoLocalisationEntity.class,cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "idGeoLocalisation")
	private GeoLocalisationEntity geoLocalisation;

    public VisiteurEntity(int id, WishListEntity wishlist, GeoLocalisationEntity geoLocalisation) {
        super(id, wishlist);
        this.geoLocalisation = geoLocalisation;
    }

    public GeoLocalisationEntity getGeoLocalisation() {
        return geoLocalisation;
    }

    public void setGeoLocalisation(GeoLocalisationEntity geoLocalisation) {
        this.geoLocalisation = geoLocalisation;
    }
}
