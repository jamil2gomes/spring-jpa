package com.jamil.springJpa.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.jamil.springJpa.domain.Role;
import com.jamil.springJpa.domain.User;
import com.jamil.springJpa.repositories.RoleRepository;
import com.jamil.springJpa.repositories.UserRepository;

@Configuration
public class Seeder implements CommandLineRunner{

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private RoleRepository roleRepo;
	
	
	@Override
	public void run(String... args) throws Exception {
		userRepo.deleteAll();
		roleRepo.deleteAll();
		
		Role role1 = new Role(null, "Administrador");
		Role role2 = new Role(null, "Secretário");
		Role role3 = new Role(null, "Aluno");
		
		roleRepo.saveAll(Arrays.asList(role1, role2, role3));
		
		
		User u1 = new User(null, "Pedro", "pedro@gmail.com");
		User u2 = new User(null, "Claudio", "claudio@gmail.com");
		User u3 = new User(null, "Cleitu", "cleitu@gmail.com");
		
		userRepo.saveAll(Arrays.asList(u1, u2, u3));
		
		u1.addRole(role1);
		u2.addRole(role2);
		u3.addRole(role1);
		
		userRepo.saveAll(Arrays.asList(u1, u2, u3));
		
	}

}
