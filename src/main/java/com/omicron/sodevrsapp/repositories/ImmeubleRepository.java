package com.omicron.sodevrsapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.omicron.sodevrsapp.entity.ImmeubleEntity;

public interface ImmeubleRepository extends CrudRepository<ImmeubleEntity, Long> {

}
