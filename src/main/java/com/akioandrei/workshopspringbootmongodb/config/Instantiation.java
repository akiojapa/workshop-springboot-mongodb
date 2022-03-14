package com.akioandrei.workshopspringbootmongodb.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.akioandrei.workshopspringbootmongodb.domain.Post;
import com.akioandrei.workshopspringbootmongodb.domain.User;
import com.akioandrei.workshopspringbootmongodb.dto.AuthorDTO;
import com.akioandrei.workshopspringbootmongodb.dto.CommentDTO;
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
		User leoni = new User(null, "Leoni Zilli", "leoni@gmail.com");
		User pedrin = new User(null, "Zé Ruelinha", "zeruela@gmail.com");
		User pedrao = new User(null, "Pedro Gaio", "pedrogalhado@gmail.com");
		
		userRepository.saveAll(Arrays.asList(akio,maike,leoni,pedrin,pedrao)); 
		
		
		
		Post post1 = new Post(null, sdf.parse("21/03/2022"), "Partiu viagem", "Vou viajar para Camburiú", new AuthorDTO(akio));
		Post post2 = new Post(null, sdf.parse("23/03/2022"), "Bom dia", "Olha meu gato", new AuthorDTO(akio));
		
		CommentDTO c1 = new CommentDTO("Boa viagem mano!",sdf.parse("21/03/2022") ,new AuthorDTO(leoni));
		CommentDTO c2 = new CommentDTO("Aproveita lá irmão!!",sdf.parse("21/03/2022") ,new AuthorDTO(maike));
		CommentDTO c3 = new CommentDTO("Que gatinho em!",sdf.parse("23/03/2022") ,new AuthorDTO(pedrin));
		CommentDTO c4 = new CommentDTO("Bom dia flor do dia",sdf.parse("23/03/2022") ,new AuthorDTO(pedrao));
		
		post1.getComments().addAll(Arrays.asList(c1,c2));
		post2.getComments().addAll(Arrays.asList(c3,c4));
		
		
		postRepository.saveAll(Arrays.asList(post1, post2));
		
		akio.getPosts().addAll(Arrays.asList(post1, post2));
		userRepository.save(akio);
		
		
	}

}
