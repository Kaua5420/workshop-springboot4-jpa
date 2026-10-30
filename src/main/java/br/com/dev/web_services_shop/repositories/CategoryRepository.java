package br.com.dev.web_services_shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dev.web_services_shop.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	
}
