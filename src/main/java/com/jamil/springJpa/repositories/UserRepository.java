package com.jamil.springJpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jamil.springJpa.domain.User;

public interface UserRepository extends JpaRepository<User,Long >{

	List<User>findByName(String nome);
}
