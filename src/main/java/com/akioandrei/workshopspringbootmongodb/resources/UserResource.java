package com.akioandrei.workshopspringbootmongodb.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akioandrei.workshopspringbootmongodb.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User akio = new User("1", "Akio Andrei", "akio@gmail.com");
		User maike = new User("1", "Maike", "maike@gmail.com");
		List<User> list =  new ArrayList<>();
		list.addAll(Arrays.asList(akio, maike));
		return ResponseEntity.ok().body(list);
	}
}


