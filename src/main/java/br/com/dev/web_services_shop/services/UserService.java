package br.com.dev.web_services_shop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.dev.web_services_shop.entities.User;
import br.com.dev.web_services_shop.repositories.UserRepository;

@Service
public class UserService {
	
	private final UserRepository repository;

	UserService(UserRepository repository) {
		this.repository = repository;
	}
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findByid(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}

}
