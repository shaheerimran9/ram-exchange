package com.ramexchange.ramexchange.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.ramexchange.ramexchange.model.User;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String>{
    Optional<User> findByEmail(String email);
}