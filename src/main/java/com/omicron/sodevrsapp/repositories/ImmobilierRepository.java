package com.omicron.sodevrsapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.omicron.sodevrsapp.entity.ImmobilierEntity;

public interface ImmobilierRepository extends CrudRepository<ImmobilierEntity, Long> {

}
