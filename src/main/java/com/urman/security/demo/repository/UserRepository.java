package com.urman.security.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.urman.security.demo.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByUserName(String userName);

	Optional<User> findByEmail(String email);

	Boolean existsByUserName(String userName);

	Boolean existsByEmail(String email);

}
