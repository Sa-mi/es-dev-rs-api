package com.omicron.sodevrsapp.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CategorieEntity{
    
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false,length = 50)
    private String libelle;
	
	@Column(nullable = true,length = 250)
    private String description;
	
	@Column(nullable = false)
    private Long idCategorieMere;
	
	@Column(nullable = false , length = 255)
    private String thumbnail; //TODO
	
    private int niveau;
    
    @OneToMany(mappedBy = "categorie")
    public Set<ProduitEntity> produits;

    public CategorieEntity() { }
    
    public CategorieEntity(Long id, String libelle, String description, Long idCategorieMere, int niveau) {
        this.id = id;
        this.libelle = libelle;
        this.description = description;
        this.idCategorieMere = idCategorieMere;
        this.niveau = niveau;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getIdCategorieMere() {
        return idCategorieMere;
    }

    public void setIdCategorieMere(Long idCategorieMere) {
        this.idCategorieMere = idCategorieMere;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }
    
}
