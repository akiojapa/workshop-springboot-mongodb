package com.akioandrei.workshopspringbootmongodb.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akioandrei.workshopspringbootmongodb.domain.User;
import com.akioandrei.workshopspringbootmongodb.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User akio = new User("1", "Akio Andrei", "akio@gmail.com");
		User maike = new User("1", "Maike", "maike@gmail.com");
		List<User> list =  service.findAll();
		return ResponseEntity.ok().body(list);
	}
}


