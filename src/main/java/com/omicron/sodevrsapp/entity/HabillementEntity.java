package com.omicron.sodevrsapp.entity;

import java.util.ArrayList;

import javax.persistence.Entity;

@Entity
public class HabillementEntity extends ProduitEntity {

	public HabillementEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HabillementEntity(Long id, String titre, String descriptif, double prix, boolean negociable,
			CategorieEntity categorie) {
		super(id, titre, descriptif, prix, negociable, categorie);
		// TODO Auto-generated constructor stub
	}

}
