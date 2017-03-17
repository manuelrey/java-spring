package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping("/user")
	public User getUser(
			@RequestParam(value = "user.id", defaultValue = "6240") String userId,
			@RequestParam(value = "name", defaultValue = "Juan") String name,
			@RequestParam(value = "age", defaultValue = "20") int age){
		User user = new User(userId, name, age);
		return user;
	}
}
