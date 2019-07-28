package com.omicron.sodevrsapp.entity;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="store")
public class StoreEntity {
	
	@Id
	@GeneratedValue
    private Long id;
	
	@Column(name = "idAnnonce")
    ArrayList<AnnonceEntity> annonces;

    public StoreEntity(Long id, ArrayList<AnnonceEntity> annonces) {
        this.id = id;
        this.annonces = annonces;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ArrayList<AnnonceEntity> getAnnonces() {
        return annonces;
    }

    public void setAnnonces(ArrayList<AnnonceEntity> annonces) {
        this.annonces = annonces;
    }

}
