package com.jamil.springJpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jamil.springJpa.domain.User;
import com.jamil.springJpa.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public List<User>findByName(String nome){
		return userRepo.findByName(nome);
	}
	
	
	
}
