package br.com.dev.web_services_shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dev.web_services_shop.entities.OrderItem;
import br.com.dev.web_services_shop.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
	
}
