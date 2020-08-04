package com.gaelsanchez.usersapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	
	@RequestMapping("/users")
	public List<User> getUsers() {
		List<User> users = new ArrayList<>();
		
		User u1 = new User();
		u1.setId(1);
		u1.setFirstName("Gael");
		u1.setLastName("Sanchez");
		
		User u2 = new User(2, "Jamo", "Sanchez");
		
		users.add(u1);
		users.add(u2);
		return users;
	}

}
