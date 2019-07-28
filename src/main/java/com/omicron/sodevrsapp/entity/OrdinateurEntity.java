package com.omicron.sodevrsapp.entity;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class OrdinateurEntity extends SmartElectroniqueEntity {

	@Column
	private String gpu;

	
	
	public OrdinateurEntity(Long id, String titre, String descriptif, double prix, boolean negociable,
			CategorieEntity categorie, String marque, String modele, String os, String cpu,
			String ram, String stockage, String gpu) {
		super(id, titre, descriptif, prix, negociable, categorie, marque, modele, os, cpu, ram, stockage);
		this.gpu = gpu;
	}

	public String getGPU() {
		return gpu;
	}

	public void setGPU(String gpu) {
		this.gpu = gpu;
	}
	
	 
}
