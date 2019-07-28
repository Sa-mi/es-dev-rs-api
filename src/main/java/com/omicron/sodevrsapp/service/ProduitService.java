package com.omicron.sodevrsapp.service;

import java.util.ArrayList;

import com.omicron.sodevrsapp.shared.dto.ProduitDto;

public interface ProduitService {
	public ProduitDto createProduit(ProduitDto produit);
	public ArrayList<ProduitDto> getAll();
}
