package com.joaodanieljr.springJavaMongoDB.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaodanieljr.springJavaMongoDB.domain.Post;
import com.joaodanieljr.springJavaMongoDB.exceptions.ObjectNotFoundException;
import com.joaodanieljr.springJavaMongoDB.repository.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() ->  new ObjectNotFoundException("Objeto não encontrado"));
	}
	
}
