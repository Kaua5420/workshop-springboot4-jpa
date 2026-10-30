package br.com.dev.web_services_shop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.dev.web_services_shop.entities.Category;
import br.com.dev.web_services_shop.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	private final CategoryRepository repository;

	CategoryService(CategoryRepository repository) {
		this.repository = repository;
	}
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findByid(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}

}
