package br.com.dev.web_services_shop.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.dev.web_services_shop.entities.Order;
import br.com.dev.web_services_shop.entities.User;
import br.com.dev.web_services_shop.repositories.OrderRepository;
import br.com.dev.web_services_shop.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	private final UserRepository userRepository;
	private final OrderRepository orderRepository;

	TestConfig(UserRepository userRepository, OrderRepository orderRepository) {
		this.userRepository = userRepository;
		this.orderRepository = orderRepository;
	}
	

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Mary White", "marymary55@gmail.com", "988448828", "123456"); 
		User u2 = new User(null, "Thomas Johnson", "tom2244@gmail.com", "981772277", "5522321"); 
		
		Order o1 = new Order(null, Instant.parse("2026-09-20T19:53:07Z"), u1); 
		Order o2 = new Order(null, Instant.parse("2026-10-21T03:42:10Z"), u2); 
		Order o3 = new Order(null, Instant.parse("2026-10-22T15:21:22Z"), u1); 
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
	
	

}
