package br.com.dev.web_services_shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dev.web_services_shop.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	
}
