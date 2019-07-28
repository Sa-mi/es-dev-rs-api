package com.omicron.sodevrsapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.omicron.sodevrsapp.entity.AnnonceurEntity;

public interface AnnonceurRepository extends CrudRepository<AnnonceurEntity, Long> {
	AnnonceurEntity findUserByEmail(String email);
	AnnonceurEntity findUserByUserId(String userId);
}
