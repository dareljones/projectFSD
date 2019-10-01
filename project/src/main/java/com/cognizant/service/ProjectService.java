package com.cognizant.service;

import java.util.List;
import com.cognizant.pojo.ActorsEntity;;
/**
* @author anup
*
*/
public interface ProjectService {
public List<ActorsEntity> getAllTodos();
public ActorsEntity getTodo(Long id);
public ActorsEntity addTodo(ActorsEntity t);
public ActorsEntity updateTodo(ActorsEntity t);
public void deleteTodo(Long id);
}