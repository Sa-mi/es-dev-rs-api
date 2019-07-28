package com.omicron.sodevrsapp.entity;

import java.util.ArrayList;

import javax.persistence.Entity;
@Entity
public class EducationEntity extends ProduitEntity {

	public EducationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EducationEntity(Long id, String titre, String descriptif, double prix, boolean negociable,
			CategorieEntity categorie) {
		super(id, titre, descriptif, prix, negociable, categorie);
		// TODO Auto-generated constructor stub
	}

	
}
