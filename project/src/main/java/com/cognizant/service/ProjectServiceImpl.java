package com.cognizant.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.ProjectRepository;
import com.cognizant.pojo.ActorsEntity;

@Service("ProjectService")
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	ProjectRepository dao;
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	@Transactional
	public List<ActorsEntity> getAllTodos() {
		Session session = sessionFactory.getCurrentSession();
		List<ActorsEntity> list = session.createQuery("from ActorsEntity").list();
		return list;
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
