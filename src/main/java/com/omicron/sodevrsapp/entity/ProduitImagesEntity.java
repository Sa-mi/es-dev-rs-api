package com.omicron.sodevrsapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ProduitImagesEntity {

	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne(targetEntity = ProduitEntity.class)
	@JoinColumn
	private ProduitEntity produit;
	
	@Column(name = "url_path", length = 1000)
	private String url;
	
	

	public ProduitImagesEntity() {}

	public ProduitImagesEntity(long id, ProduitEntity produit, String url) {
		super();
		this.id = id;
		this.produit = produit;
		this.url = url;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ProduitEntity getProduit() {
		return produit;
	}

	public void setProduit(ProduitEntity produit) {
		this.produit = produit;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
	
}
