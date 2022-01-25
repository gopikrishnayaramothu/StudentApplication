package com.example.learning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.learning.entity.User;
import com.example.learning.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;
	
	public User getUserByUsername(String userName) {
		return userRepo.findByUserName(userName);
	}
}
