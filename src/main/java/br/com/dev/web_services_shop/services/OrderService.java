package br.com.dev.web_services_shop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.dev.web_services_shop.entities.Order;
import br.com.dev.web_services_shop.repositories.OrderRepository;

@Service
public class OrderService {
	
	private final OrderRepository repository;

	OrderService(OrderRepository repository) {
		this.repository = repository;
	}
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findByid(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}

}
