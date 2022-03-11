package com.akioandrei.workshopspringbootmongodb.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.akioandrei.workshopspringbootmongodb.domain.Post;
import com.akioandrei.workshopspringbootmongodb.domain.User;
import com.akioandrei.workshopspringbootmongodb.repository.PostRepository;
import com.akioandrei.workshopspringbootmongodb.repository.UserRepository;


@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userRepository.deleteAll();
		postRepository.deleteAll();
		
		User akio = new User(null, "Akio Andrei", "akioandrei@gmail.com");
		User maike = new User(null, "Maikola Snow", "maikola@gmail.com");
		User leoni = new User(null, "Leoni", "leoni@gmail.com");
		
		Post post1 = new Post(null, sdf.parse("21/03/2022"), "Partiu viagem", "Vou viajar para Camburiú", akio);
		Post post2 = new Post(null, sdf.parse("23/03/2022"), "Bom dia", "Olha meu gato", akio);
		
		
		
		userRepository.saveAll(Arrays.asList(akio,maike,leoni));
		postRepository.saveAll(Arrays.asList(post1, post2));
		
		
	}

}
