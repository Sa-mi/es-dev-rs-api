package com.omicron.sodevrsapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AdresseEntity {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(length = 100)
	private String quartier;
	
	@Column(length = 50)
	private String ville;
	
	@Column(length = 50)
	private String pays;

	public AdresseEntity(int id, String quartier, String ville, String pays) {
		super();
		this.id = id;
		this.quartier = quartier;
		this.ville = ville;
		this.pays = pays;
	}

	public AdresseEntity() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuartier() {
		return quartier;
	}

	public void setQuartier(String quartier) {
		this.quartier = quartier;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}
	
	
	
}
