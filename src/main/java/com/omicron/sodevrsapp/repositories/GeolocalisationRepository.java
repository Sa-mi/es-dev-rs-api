package com.omicron.sodevrsapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.omicron.sodevrsapp.entity.GeoLocalisationEntity;

public interface GeolocalisationRepository extends CrudRepository<GeoLocalisationEntity, Long> {

}
