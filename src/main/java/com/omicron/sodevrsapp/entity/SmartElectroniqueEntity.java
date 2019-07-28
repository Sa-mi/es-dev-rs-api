package com.omicron.sodevrsapp.entity;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class SmartElectroniqueEntity extends ElectroniqueEntity {
	
	@Column(length = 50)
	private String os;
	
	@Column(length = 50)
	private String cpu;
	
	@Column(length = 50)
	private String ram;
	
	@Column(length = 50)
	private String stockage;


	public SmartElectroniqueEntity(Long id, String titre, String descriptif, double prix, boolean negociable,
			 CategorieEntity categorie, String marque, String modele, String os, String cpu,
			String ram, String stockage) {
		super(id, titre, descriptif, prix, negociable, categorie, marque, modele);
		this.os = os;
		this.cpu = cpu;
		this.ram = ram;
		this.stockage = stockage;
	}

	public String getOS() {
		return os;
	}

	public void setOS(String os) {
		this.os = os;
	}

	public String getCPU() {
		return cpu;
	}

	public void setCPU(String cpu) {
		this.cpu = cpu;
	}

	public String getRAM() {
		return ram;
	}

	public void setRAM(String ram) {
		this.ram = ram;
	}

	public String getStockage() {
		return stockage;
	}

	public void setStockage(String stockage) {
		this.stockage = stockage;
	}
	
	
	
 }
