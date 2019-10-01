package com.cognizant.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.cognizant.pojo.ActorsEntity;
import  com.cognizant.service.ProjectService;



@RestController
public class ProjectController {
@Autowired
ProjectService service;
@RequestMapping(value = "/", method = RequestMethod.GET)
public String getHomePage() {
return "index";
}
@RequestMapping(value = "/todos/addTodo", method = RequestMethod.POST, headers = "Accept=application/json")
public ActorsEntity addTodo(@RequestBody ActorsEntity t) {
ActorsEntity todo = service.addTodo(t);
return todo;
}

}
