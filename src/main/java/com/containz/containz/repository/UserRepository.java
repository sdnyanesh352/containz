package com.containz.containz.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.containz.containz.model.User;

/**
 * 
 */
public interface UserRepository extends CrudRepository<User, Long> {

    User findByEmail(String email);

	Optional<User> findById(String ref);

	User findByUsername(String username);

	

}
