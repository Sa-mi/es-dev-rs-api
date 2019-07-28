package com.omicron.sodevrsapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.omicron.sodevrsapp.entity.ProfessionnelEntity;

@Repository
public interface ProfessionnelRepository extends CrudRepository<ProfessionnelEntity, Long> {
	ProfessionnelEntity findUserByEmail(String email);
}
