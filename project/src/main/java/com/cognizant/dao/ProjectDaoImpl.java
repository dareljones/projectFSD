package com.cognizant.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cognizant.pojo.ActorsEntity;

@Repository("ProjectDao")
public class ProjectDaoImpl implements ProjectDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addTodo(ActorsEntity c) {
		Session session = sessionFactory.getCurrentSession();
		session.save(c);

	}

	@Override
	public List<ActorsEntity> getTodos() {
		Session session = sessionFactory.getCurrentSession();
		List<ActorsEntity> list = session.createQuery("from mentortable").list();
		return list;
	}

	@Override
	public void deleteTodo(int id) {
		Session session = sessionFactory.getCurrentSession();
		ActorsEntity c = session.load(ActorsEntity.class, new Integer(id));
		if (c != null)
			session.delete(c);

	}

	@Override
	public void updateTodo(ActorsEntity c) {
		Session session = sessionFactory.getCurrentSession();
		session.update(c);
	}

	@Override
	public ActorsEntity getTodo(int id) {
		Session session = sessionFactory.getCurrentSession();
		ActorsEntity c = (ActorsEntity) session.get(ActorsEntity.class, id);
		return c;

	}

}
