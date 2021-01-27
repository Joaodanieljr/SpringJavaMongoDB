package com.joaodanieljr.springJavaMongoDB.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaodanieljr.springJavaMongoDB.domain.User;
import com.joaodanieljr.springJavaMongoDB.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}
}
