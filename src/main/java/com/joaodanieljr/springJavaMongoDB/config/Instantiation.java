package com.joaodanieljr.springJavaMongoDB.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.joaodanieljr.springJavaMongoDB.domain.User;
import com.joaodanieljr.springJavaMongoDB.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User maria = new User(null, "Maria", "maria@gmail.com");
		User jose = new User(null, "Jose", "jose@gmail.com");
		User joao = new User(null, "Joao", "joao@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria, jose, joao));
		
	}
	
}
