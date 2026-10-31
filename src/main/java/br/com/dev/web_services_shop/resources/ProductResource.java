package br.com.dev.web_services_shop.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dev.web_services_shop.entities.Product;
import br.com.dev.web_services_shop.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	private final ProductService service;

	ProductResource(ProductService service) {
		this.service = service;
	}
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product obj = service.findByid(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
