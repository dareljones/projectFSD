package com.cognizant.dao;

import java.util.List;

import com.cognizant.pojo.ActorsEntity;;

public interface ProjectDao  {

	public void addTodo(ActorsEntity c);

	public List<ActorsEntity> getTodos();

	public void deleteTodo(int id);

	public void updateTodo(ActorsEntity c);
	
	public ActorsEntity getTodo(int id);


}
