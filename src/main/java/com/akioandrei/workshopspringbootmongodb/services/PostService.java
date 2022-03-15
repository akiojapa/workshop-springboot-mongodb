package com.akioandrei.workshopspringbootmongodb.services;

import java.util.Date;
import java.util.List;
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
	
	public List<Post> findByTitle(String text){
		//return repo.findByTitleContainingIgnoreCase(text);  // Encontrando com query methods.
	return repo.searchTitle(text); // Encontrando com @Query 
	}
	
	public List<Post> fullSearch(String text, Date minDate, Date maxDate){
		maxDate = new Date(maxDate.getTime() + 24 *60 * 60 * 1000);
		return repo.fullSearch(text, minDate, maxDate);
		
		
	}
	
}
