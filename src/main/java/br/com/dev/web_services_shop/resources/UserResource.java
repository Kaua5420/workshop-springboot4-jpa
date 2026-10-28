package br.com.dev.web_services_shop.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dev.web_services_shop.entities.User;
import br.com.dev.web_services_shop.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	private final UserService service;

	UserResource(UserService service) {
		this.service = service;
	}
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User obj = service.findByid(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
