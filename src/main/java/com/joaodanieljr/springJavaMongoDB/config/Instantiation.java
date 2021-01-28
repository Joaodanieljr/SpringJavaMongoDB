package com.joaodanieljr.springJavaMongoDB.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.joaodanieljr.springJavaMongoDB.domain.Post;
import com.joaodanieljr.springJavaMongoDB.domain.User;
import com.joaodanieljr.springJavaMongoDB.repository.PostRepository;
import com.joaodanieljr.springJavaMongoDB.repository.UserRepository;

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
		
		User maria = new User(null, "Maria", "maria@gmail.com");
		User jose = new User(null, "Jose", "jose@gmail.com");
		User joao = new User(null, "Joao", "joao@gmail.com");
		
	
		Post post1 = new Post(null, sdf.parse("21/03/2018"), "Partiu viagem", "Vou viajar para São Paulo. Abraços!", maria);
		Post post2 = new Post(null, sdf.parse("23/03/2018"), "Bom dia", "Acordei feliz hoje!", maria);

		userRepository.saveAll(Arrays.asList(maria, jose, joao));
		postRepository.saveAll(Arrays.asList(post1, post2));
	}
	
}
