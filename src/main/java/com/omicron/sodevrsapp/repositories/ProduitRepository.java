package com.omicron.sodevrsapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.omicron.sodevrsapp.entity.ProduitEntity;

public interface ProduitRepository extends CrudRepository<ProduitEntity, Long> {
	
}
