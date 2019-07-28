package com.omicron.sodevrsapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.omicron.sodevrsapp.entity.ParticulierEntity;

@Repository
public interface ParticulierRepository extends CrudRepository<ParticulierEntity, Long> {
	ParticulierEntity findUserByEmail(String email);
}
