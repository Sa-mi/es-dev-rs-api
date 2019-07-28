package com.omicron.sodevrsapp.entity;

import java.util.ArrayList;

import javax.persistence.Entity;
@Entity
public class MaisonJardinEntity extends ProduitEntity {

	public MaisonJardinEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MaisonJardinEntity(Long id, String titre, String descriptif, double prix, boolean negociable,
			ArrayList<String> images, CategorieEntity categorie) {
		super(id, titre, descriptif, prix, negociable, categorie);
		// TODO Auto-generated constructor stub
	}
	
}
