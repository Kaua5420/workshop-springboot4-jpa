package br.com.dev.web_services_shop.config;

import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.dev.web_services_shop.entities.User;
import br.com.dev.web_services_shop.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	private final UserRepository userRepository;

	TestConfig(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Mary White", "marymary55@gmail.com", "988448828", "123456"); 
		User u2 = new User(null, "Thomas Johnson", "tom2244@gmail.com", "981772277", "5522321"); 
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	

}
