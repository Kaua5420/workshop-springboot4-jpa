package br.com.dev.web_services_shop.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.dev.web_services_shop.entities.Category;
import br.com.dev.web_services_shop.entities.Order;
import br.com.dev.web_services_shop.entities.User;
import br.com.dev.web_services_shop.entities.enums.OrderStatus;
import br.com.dev.web_services_shop.repositories.CategoryRepository;
import br.com.dev.web_services_shop.repositories.OrderRepository;
import br.com.dev.web_services_shop.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	private final UserRepository userRepository;
	private final OrderRepository orderRepository;
	private final CategoryRepository categoryRepository;

	TestConfig(UserRepository userRepository, OrderRepository orderRepository, CategoryRepository categoryRepository) {
		this.userRepository = userRepository;
		this.orderRepository = orderRepository;
		this.categoryRepository = categoryRepository;
	}
	

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Mary White", "marymary55@gmail.com", "988448828", "123456"); 
		User u2 = new User(null, "Thomas Johnson", "tom2244@gmail.com", "981772277", "5522321"); 
		
		Order o1 = new Order(null, Instant.parse("2026-09-20T19:53:07Z"), OrderStatus.DELIVERED, u1); 
		Order o2 = new Order(null, Instant.parse("2026-10-21T03:42:10Z"), OrderStatus.CANCELED, u2); 
		Order o3 = new Order(null, Instant.parse("2026-10-22T15:21:22Z"), OrderStatus.PAID, u1);
		
		Category cat1 = new Category(null, "Electronics"); 
		Category cat2 = new Category(null, "Books"); 
		Category cat3 = new Category(null, "Computers");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
	}
	
	

}
