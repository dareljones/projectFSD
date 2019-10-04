package com.cognizant.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.cognizant.pojo.UserDetailsEntity;
import  com.cognizant.service.ProjectService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProjectController {
@Autowired
ProjectService service;
@RequestMapping(value = "/", method = RequestMethod.GET)
public String getHomePage() {
return "index";
}

@RequestMapping(value = "/getUser/{userName}", method = RequestMethod.GET)
public UserDetailsEntity getUser(@PathVariable String userName) {
	System.out.println(userName);
	System.out.println(service.getUser(userName));
return service.getUser(userName);
}

}
