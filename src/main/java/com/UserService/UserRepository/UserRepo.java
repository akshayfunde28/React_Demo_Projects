package com.UserService.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UserService.Entity.User;

public interface UserRepo  extends JpaRepository<User, String>{
	

}
