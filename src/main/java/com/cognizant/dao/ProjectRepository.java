package com.cognizant.dao;

import org.springframework.data.repository.CrudRepository;

import com.cognizant.pojo.TechnologiesEntity;

public interface ProjectRepository extends CrudRepository<TechnologiesEntity, Integer> {

	

}
