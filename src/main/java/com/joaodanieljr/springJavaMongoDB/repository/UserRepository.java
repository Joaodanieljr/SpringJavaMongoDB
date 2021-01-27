package com.joaodanieljr.springJavaMongoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.joaodanieljr.springJavaMongoDB.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
