package com.omicron.sodevrsapp.entity;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "Produit")
public class ProduitEntity {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false, length = 50)
	private String titre;
	
	@Column(nullable = false, length = 150)
	private String descriptif;
	
	@Column(nullable = false, length = 50)
	private double prix;
	
	@Column(nullable = true)
	private boolean negociable;
	

	@ManyToOne
	@JoinColumn
	private CategorieEntity categorie;

	public ProduitEntity(Long id, String titre, String descriptif, double prix, boolean negociable, CategorieEntity categorie) {
		this.id = id;
		this.titre = titre;
		this.descriptif = descriptif;
		this.prix = prix;
		this.negociable = negociable;
		this.categorie = categorie;
	}

	public ProduitEntity() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescriptif() {
		return descriptif;
	}

	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public boolean isNegociable() {
		return negociable;
	}

	public void setNegociable(boolean negociable) {
		this.negociable = negociable;
	}

	

	public CategorieEntity getCategorie() {
		return categorie;
	}

	public void setCategorie(CategorieEntity categorie) {
		this.categorie = categorie;
	}
	
	

}
