package com.youssef.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import com.youssef.users.entities.Role;
import com.youssef.users.entities.User;
import com.youssef.users.service.UserService;
import jakarta.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestuserApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestuserApplication.class, args);
	}

	@Autowired
	UserService userService;

	/*@PostConstruct
	void init_users() {
		// ajouter les rôles
		userService.addRole(new Role(null, "ADMIN"));
		userService.addRole(new Role(null, "USER"));
		// ajouter les users
		userService.saveUser(new User(null, "admin", "123", true, null));
		userService.saveUser(new User(null, "user", "123", true, null));
		userService.saveUser(new User(null, "youssef", "123", true, null));
		// ajouter les rôles aux users
		userService.addRoleToUser("admin", "ADMIN");
		userService.addRoleToUser("admin", "USER");
		userService.addRoleToUser("user", "USER");
		userService.addRoleToUser("youssef", "USER");
	}*/

	@Bean
	BCryptPasswordEncoder getBCE() {
		return new BCryptPasswordEncoder();
	}

}
