package com.raffles;

import com.raffles.entities.User;
import com.raffles.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RafflesBackendApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(RafflesBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*User user = new User();

		user.setUsername("miguelAngel");
		user.setName("Miguel Ángel");
		user.setPassword("123456");

		User savedUser = userService.saveUser(user);
		System.out.println(savedUser.getUsername());*/
	}
}
