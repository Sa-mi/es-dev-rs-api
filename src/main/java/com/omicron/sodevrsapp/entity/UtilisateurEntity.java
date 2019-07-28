package com.omicron.sodevrsapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public abstract class UtilisateurEntity {
	
	@Id
	@GeneratedValue
	private int id;
	@OneToOne
	@JoinColumn
	WishListEntity wishlist;
	
	public UtilisateurEntity() {}

	public UtilisateurEntity(int id, WishListEntity wishlist) {
		this.id = id;
		this.wishlist = wishlist;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public WishListEntity getWishlist() {
		return wishlist;
	}

	public void setWishlist(WishListEntity wishlist) {
		this.wishlist = wishlist;
	}
}
