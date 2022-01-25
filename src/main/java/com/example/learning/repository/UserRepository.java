package com.example.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.learning.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	 User findByUserName(String username);

}
