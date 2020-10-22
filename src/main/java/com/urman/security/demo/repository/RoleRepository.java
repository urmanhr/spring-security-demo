package com.urman.security.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.urman.security.demo.models.Role;
import com.urman.security.demo.models.RoleEnum;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

	Optional<Role> findByName(RoleEnum name);
}
