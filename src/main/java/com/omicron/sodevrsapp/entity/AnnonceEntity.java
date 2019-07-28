package com.omicron.sodevrsapp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class AnnonceEntity{
	@Id
	@GeneratedValue
    private Long id;
	
	@ManyToOne(targetEntity = ProduitEntity.class)
	@JoinColumn
    private AnnonceurEntity annonceur;
	
	@ManyToOne(targetEntity = ProduitEntity.class)
	@JoinColumn
	private ProduitEntity produit;
    
	@Column
	@DateTimeFormat
	private Date dateAnnonce;

    public AnnonceEntity(Long id, AnnonceurEntity annonceur, ProduitEntity produit, Date dateAnnonce) {
        this.id = id;
        this.annonceur = annonceur;
        this.produit = produit;
        this.dateAnnonce = dateAnnonce;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AnnonceurEntity getAnnonceur() {
        return annonceur;
    }

    public void setAnnonceur(AnnonceurEntity annonceur) {
        this.annonceur = annonceur;
    }

    public ProduitEntity getProduit() {
        return produit;
    }

    public void setProduit(ProduitEntity produit) {
        this.produit = produit;
    }

    public Date getDateAnnonce() {
        return dateAnnonce;
    }

    public void setDateAnnonce(Date dateAnnonce) {
        this.dateAnnonce = dateAnnonce;
    }

}
