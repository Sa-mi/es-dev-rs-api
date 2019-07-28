package com.omicron.sodevrsapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class LaptopEntity extends OrdinateurEntity {
	@Column
	private String batterie;

	public LaptopEntity(Long id, String titre, String descriptif, double prix, boolean negociable, CategorieEntity categorie,
			String marque, String modele, String os, String cpu, String ram, String stockage, String gpu,
			String batterie) {
		super(id, titre, descriptif, prix, negociable, categorie, marque, modele, os, cpu, ram, stockage, gpu);
		this.batterie = batterie;
	}

	public String getBatterie() {
		return batterie;
	}

	public void setBatterie(String batterie) {
		this.batterie = batterie;
	}
	
	
}
