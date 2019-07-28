package com.omicron.sodevrsapp.entity;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class CameraEntity extends ElectroniqueEntity {

	@Column(length = 10)
	private int pixels;

	

	public CameraEntity(Long id, String titre, String descriptif, double prix, boolean negociable,
			CategorieEntity categorie, String marque, String modele, int pixels) {
		super(id, titre, descriptif, prix, negociable, categorie, marque, modele);
		this.pixels = pixels;
	}

	public int getPixels() {
		return pixels;
	}

	public void setPixels(int pixels) {
		this.pixels = pixels;
	}
	
	
}
