package com.omicron.sodevrsapp.ui.controller;

import java.util.ArrayList;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.omicron.sodevrsapp.entity.CategorieEntity;
import com.omicron.sodevrsapp.entity.LaptopEntity;
import com.omicron.sodevrsapp.entity.ProduitEntity;
import com.omicron.sodevrsapp.service.ProduitService;
import com.omicron.sodevrsapp.shared.dto.ProduitDto;
import com.omicron.sodevrsapp.ui.model.request.ProduitRequestModel;
import com.omicron.sodevrsapp.ui.model.response.LaptopResponseModel;
import com.omicron.sodevrsapp.ui.model.response.ProduitResponseModel;


@RestController
@RequestMapping("/produits")
public class ProduitController {
	
	@Autowired
	ProduitService produitService;

	@GetMapping
	@RequestMapping("/test")
	public LaptopEntity getProduits() {
		
		LaptopResponseModel returnValue = new LaptopResponseModel();
		
		ArrayList<String> images = new ArrayList<String>();
		images.add("image 1");
		images.add("image 2");
		images.add("image 3");
		
		CategorieEntity categorie = new CategorieEntity(3L,"libelle", "description", 22L, 0);
		
		LaptopEntity produit = new LaptopEntity(1L, "titre", "descriptif", 9999.99, true, categorie, "marque", "modele", "os", "cpu", "ram", "stockage", "gpu", "batterie");	
	    
		BeanUtils.copyProperties(produit, returnValue);
		
		return produit;
	}
	
	@GetMapping
	@RequestMapping("/all")
	public ArrayList<ProduitDto> getAllProduits() {
				
		return produitService.getAll();
	}
	
	@PostMapping
	public ProduitResponseModel createProduit(@RequestBody ProduitRequestModel produit) {
		
		ProduitResponseModel returnValue = new ProduitResponseModel();
		
		ProduitDto produitDto = new ProduitDto();
		BeanUtils.copyProperties(produit, produitDto);
		
		ProduitDto StoredProduit = produitService.createProduit(produitDto);
		BeanUtils.copyProperties(StoredProduit, returnValue);
		
		
		returnValue.setCategorie(new CategorieEntity(3L,"libelle", "description", 22L, 0));
		
		return returnValue;
	}
}
