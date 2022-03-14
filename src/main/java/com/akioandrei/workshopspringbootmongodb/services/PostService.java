package com.akioandrei.workshopspringbootmongodb.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akioandrei.workshopspringbootmongodb.domain.Post;
import com.akioandrei.workshopspringbootmongodb.repository.PostRepository;
import com.akioandrei.workshopspringbootmongodb.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(""));
	}
	

	
}