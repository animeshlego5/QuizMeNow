package com.exam;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication

public class ExamserverApplication implements CommandLineRunner {
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		try {
//			System.out.println("hi");
//			User user = new User();
//
//			user.setFirstName(("Animesh"));
//			user.setLastName("Gosain");
//			user.setUsername("animesh12");
//			user.setPassword("test");
//
//			Role role1 = new Role();
//			role1.setRoleName("Admin");
//			role1.setRoleId(4422L);
//
//			Set<UserRole> userRoleSet = new HashSet<>();
//			UserRole userRole = new UserRole();
//
//			userRole.setRole(role1);
//			userRole.setUser(user);
//			userRoleSet.add(userRole);
//			User user1 = this.userService.createUser(user, userRoleSet);
//			System.out.println(user1.getUsername());
//
//		}
//		catch(Exception e) {
//			System.out.println("exception found");
//			System.out.println(e.getMessage());
//		}

	}
}
