package com.omicron.sodevrsapp.ui.controller;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.omicron.sodevrsapp.entity.AnnonceEntity;
import com.omicron.sodevrsapp.entity.AnnonceurEntity;
import com.omicron.sodevrsapp.entity.CategorieEntity;
import com.omicron.sodevrsapp.entity.LaptopEntity;
import com.omicron.sodevrsapp.entity.EtatProduit;

@RestController
@RequestMapping("/annonces")
public class AnnoncesController {
	
	@GetMapping
	public ArrayList<AnnonceEntity> getAnnonces() {
		
		ArrayList<AnnonceEntity> annonces = new ArrayList<AnnonceEntity>();
		/*
		AnnonceEntity a1 = new AnnonceEntity(
				9L,
				new AnnonceurEntity(1,"Hassan","0123456789","xyz@xyz.com"),
				new LaptopEntity(  1L,  "lenovo t430 i5",  "descriptif",  999.00D,  false,new CategorieEntity(1L,"libelle","description",0L,0),   "lenovo",  "t430",  "windows 7",  "2.26",  "8",  "320",  "intel 4000",  "2"),
				new Date(2019,5,3)
				); 
		
		AnnonceEntity a2 = new AnnonceEntity(
				8L,
				new AnnonceurEntity(1,"Hassan","0123456789","xyz@xyz.com"),
				new LaptopEntity(  1L,  "lenovo t430 i5",  "descriptif",  999.00D,  false,new CategorieEntity(1L,"libelle","description",0L,0),   "lenovo",  "t430",  "windows 7",  "2.26",  "8",  "320",  "intel 4000",  "2"),
				new Date(2019,5,3)
				); 
		AnnonceEntity a3 = new AnnonceEntity(
				7L,
				new AnnonceurEntity(1,"Hassan","0123456789","xyz@xyz.com"),
				new LaptopEntity(  1L,  "lenovo t430 i5",  "descriptif",  999.00D,  false,new CategorieEntity(1L,"libelle","description",0L,0),   "lenovo",  "t430",  "windows 7",  "2.26",  "8",  "320",  "intel 4000",  "2"),
				new Date(2019,5,3)
				); 
		AnnonceEntity a4 = new AnnonceEntity(
				6L,
				new AnnonceurEntity(1,"Hassan","0123456789","xyz@xyz.com"),
				new LaptopEntity(  1L,  "lenovo t430 i5",  "descriptif",  999.00D,  false,new CategorieEntity(1L,"libelle","description",0L,0),   "lenovo",  "t430",  "windows 7",  "2.26",  "8",  "320",  "intel 4000",  "2"),
				new Date(2019,5,3)
				); 
		AnnonceEntity a5 = new AnnonceEntity(
				5L,
				new AnnonceurEntity(1,"Hassan","0123456789","xyz@xyz.com"),
				new LaptopEntity(  1L,  "lenovo t430 i5",  "descriptif",  999.00D,  false,new CategorieEntity(1L,"libelle","description",0L,0),   "lenovo",  "t430",  "windows 7",  "2.26",  "8",  "320",  "intel 4000",  "2"),
				new Date(2019,5,3)
				); 
		
		annonces.add(a1);
		annonces.add(a2);
		annonces.add(a3);
		annonces.add(a4);
		annonces.add(a5);
		*/
		return annonces;
		
	}
	
}
