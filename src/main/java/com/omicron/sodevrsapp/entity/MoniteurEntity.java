package com.omicron.sodevrsapp.entity;

import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class MoniteurEntity extends ElectroniqueEntity {

	@Column(nullable = true,name="resolution",length = 50)
	private String resolution;
	
	@Column(nullable = true,name="pouce",length = 50)
	private int pouce;
	
	@Column(nullable = true,name="os",length = 50)
	private String os;

	

	public MoniteurEntity(Long id, String titre, String descriptif, double prix, boolean negociable, 
			CategorieEntity categorie, String marque, String modele, String resolution, int pouce, String os) {
		super(id, titre, descriptif, prix, negociable, categorie, marque, modele);
		this.resolution = resolution;
		this.pouce = pouce;
		this.os = os;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public int getPouce() {
		return pouce;
	}

	public void setPouce(int pouce) {
		this.pouce = pouce;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

}
