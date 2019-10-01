package com.cognizant.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.ProjectRepository;
import com.cognizant.pojo.ActorsEntity;

@Service("ProjectService")
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	ProjectRepository dao;
	

	@Override
	@Transactional
	public List<ActorsEntity> getAllTodos() {
		List<ActorsEntity> todoList = new ArrayList<>();
		dao.findAll().forEach(e -> todoList.add(e));
		return todoList;
	}

	@Override
	public ActorsEntity getTodo(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ActorsEntity addTodo(ActorsEntity t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ActorsEntity updateTodo(ActorsEntity t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteTodo(Long id) {
		// TODO Auto-generated method stub

	}

}
