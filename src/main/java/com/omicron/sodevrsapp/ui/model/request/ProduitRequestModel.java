package com.omicron.sodevrsapp.ui.model.request;

import java.util.ArrayList;

import com.omicron.sodevrsapp.entity.CategorieEntity;

public class ProduitRequestModel {

	private String titre;
	private String descriptif;
	private double prix;
	private boolean negociable;
	private CategorieEntity categorie;
	private ArrayList<String> images;
	private String etatProduit;
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
	public ArrayList<String> getImages() {
		return images;
	}
	public void setImages(ArrayList<String> images) {
		this.images = images;
	}
	public String getEtatProduit() {
		return etatProduit;
	}
	public void setEtatProduit(String etatProduit) {
		this.etatProduit = etatProduit;
	}
	
	
	
	
	
	
}
