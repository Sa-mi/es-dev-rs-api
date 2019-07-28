package com.omicron.sodevrsapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.omicron.sodevrsapp.entity.AnnonceEntity;

public interface AnnonceRepository extends CrudRepository<AnnonceEntity, Long> {

}