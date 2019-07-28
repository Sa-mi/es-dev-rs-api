package com.omicron.sodevrsapp.shared.dto;

import java.io.Serializable;

public class AnnonceurDto implements Serializable {

	private static final long serialVersionUID = -815383722199402778L;
	private Long id;
	private String userId;
	private String nom;
	private String telephone;
	private String email;
	private String password;
	private String encryptedPassword;
	private String emailVerificationToken;
	private boolean emailVerficationStatus = false;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
