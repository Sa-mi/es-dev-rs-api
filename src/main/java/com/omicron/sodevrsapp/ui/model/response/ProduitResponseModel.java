package com.omicron.sodevrsapp.ui.model.response;

import java.util.ArrayList;

import com.omicron.sodevrsapp.entity.CategorieEntity;


public class ProduitResponseModel {

	private String titre;
	private String descriptif;
	private double prix;
	private boolean negociable;
	private ArrayList<String> images;
	private CategorieEntity categorie;
	
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
	public ArrayList<String> getImages() {
		return images;
	}
	public void setImages(ArrayList<String> images) {
		this.images = images;
	}
	public CategorieEntity getCategorie() {
		return categorie;
	}
	public void setCategorie(CategorieEntity categorie) {
		this.categorie = categorie;
	}
	
	
		
	
}
