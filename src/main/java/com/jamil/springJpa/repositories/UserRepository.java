package com.jamil.springJpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jamil.springJpa.domain.User;

public interface UserRepository extends JpaRepository<User,Long > {

}
