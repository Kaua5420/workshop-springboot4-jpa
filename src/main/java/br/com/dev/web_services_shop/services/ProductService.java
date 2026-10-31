package br.com.dev.web_services_shop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.dev.web_services_shop.entities.Product;
import br.com.dev.web_services_shop.repositories.ProductRepository;

@Service
public class ProductService {
	
	private final ProductRepository repository;

	ProductService(ProductRepository repository) {
		this.repository = repository;
	}
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findByid(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}

}
