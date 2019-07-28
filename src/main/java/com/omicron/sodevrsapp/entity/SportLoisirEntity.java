package com.omicron.sodevrsapp.entity;

import java.util.ArrayList;

import javax.persistence.Entity;
@Entity
public class SportLoisirEntity extends ProduitEntity {

	public SportLoisirEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SportLoisirEntity(Long id, String titre, String descriptif, double prix, boolean negociable,
			 CategorieEntity categorie) {
		super(id, titre, descriptif, prix, negociable, categorie);
		// TODO Auto-generated constructor stub
	}

	
}
