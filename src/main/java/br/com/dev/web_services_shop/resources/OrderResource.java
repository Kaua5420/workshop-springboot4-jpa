package br.com.dev.web_services_shop.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dev.web_services_shop.entities.Order;
import br.com.dev.web_services_shop.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	private final OrderService service;

	OrderResource(OrderService service) {
		this.service = service;
	}
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		List<Order> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order obj = service.findByid(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
