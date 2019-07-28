package com.omicron.sodevrsapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class AnnonceurEntity extends UtilisateurEntity implements Serializable {
	
	private static final long serialVersionUID = -7265681924916812986L;

	@Column(nullable = false,length = 50,unique = true)
	private String userId;
	
	@Column(nullable = false,length = 30)
    private String nom;
    
	@Column(nullable = false,length = 10)
	private String telephone;
	
	@Column(nullable = false,length = 50,unique = true)
	private String email;
	
	@Column(nullable = false,length = 500)
	private String encryptedPassword;
		
	private String emailVerificationToken;
	
	@Column(nullable = false)
	private boolean emailVerficationStatus = false;

	public AnnonceurEntity() {}
	
	public AnnonceurEntity(int id, WishListEntity wishlist, String userId, String nom, String telephone, String email,
			String encryptedPassword) {
		super(id, wishlist);
		this.userId = userId;
		this.nom = nom;
		this.telephone = telephone;
		this.email = email;
		this.encryptedPassword = encryptedPassword;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}

	public String getEmailVerificationToken() {
		return emailVerificationToken;
	}

	public void setEmailVerificationToken(String emailVerificationToken) {
		this.emailVerificationToken = emailVerificationToken;
	}

	public boolean isEmailVerficationStatus() {
		return emailVerficationStatus;
	}

	public void setEmailVerficationStatus(boolean emailVerficationStatus) {
		this.emailVerficationStatus = emailVerficationStatus;
	}

	
    
    
}
