package com.omicron.sodevrsapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class GeoLocalisationEntity {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(length = 50)
	private double longitude;
	
	@Column(length = 50)
	private double latitude;

	public GeoLocalisationEntity(int id, double longitude, double latitude) {
		super();
		this.id = id;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public GeoLocalisationEntity() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	
}
