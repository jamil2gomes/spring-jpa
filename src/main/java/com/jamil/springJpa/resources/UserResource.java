package com.jamil.springJpa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jamil.springJpa.domain.User;
import com.jamil.springJpa.resources.util.Url;
import com.jamil.springJpa.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService service;
	
	
	//exemplo: users/search?name=Pedro
	@GetMapping(value="/search")
	public ResponseEntity<List<User>>findByName(@RequestParam(value = "name", defaultValue = "")String nome){
		Url.decodeParam(nome);
		List<User>list = service.findByName(nome);
		
		return ResponseEntity.ok().body(list);
	}
}
