package com.omicron.sodevrsapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.omicron.sodevrsapp.entity.UtilisateurEntity;
@Repository
public interface UtilisateurRepository extends CrudRepository<UtilisateurEntity, Long> {

}
