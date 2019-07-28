package com.omicron.sodevrsapp.entity;

import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class MobileEntity extends SmartElectroniqueEntity {
	
	@Column(nullable = true,name="batterie",length = 50)
	private String batterie;
	@Column(nullable = true,name="camera",length = 50)
	private String camera;
	
	
	
	public MobileEntity(Long id, String titre, String descriptif, double prix, boolean negociable, 
			CategorieEntity categorie, String marque, String modele, String os, String cpu, String ram, String stockage,
			String batterie, String camera) {
		super(id, titre, descriptif, prix, negociable, categorie, marque, modele, os, cpu, ram, stockage);
		this.batterie = batterie;
		this.camera = camera;
	}
	public String getBatterie() {
		return batterie;
	}
	public void setBatterie(String batterie) {
		this.batterie = batterie;
	}
	public String getCamera() {
		return camera;
	}
	public void setCamera(String camera) {
		this.camera = camera;
	}
	
	
}
