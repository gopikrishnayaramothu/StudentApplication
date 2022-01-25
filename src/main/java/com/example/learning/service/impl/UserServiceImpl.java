package com.example.learning.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.learning.entity.Roles;
import com.example.learning.entity.User;
import com.example.learning.service.UserService;


@Service
public class UserServiceImpl implements UserDetailsService{

	@Autowired
	UserService userService;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		 User user = userService.getUserByUsername(username);
		 if(user == null)
			 throw new UsernameNotFoundException("not found");
		 System.out.println("user details"+ user.getEmail());
		 Set<SimpleGrantedAuthority> roles= new HashSet<>();
		 for(Roles role: user.getRoles()) {
			 roles.add(new SimpleGrantedAuthority(role.getRole()));
		 }
		 return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(), roles);
	}

}
