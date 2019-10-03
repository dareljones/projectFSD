package com.cognizant.dao;

import org.springframework.data.repository.CrudRepository;

import com.cognizant.pojo.ActorsEntity;

public interface ProjectRepository extends CrudRepository<ActorsEntity, Integer> {

	

}
