package com.UserService.Services;

import java.util.List;

import com.UserService.Entity.User;

public interface UserServices {
	
	
	
	User saveUser(User user);
	
	List<User> getAllUser();
	
	User getUser(String UserId);
	
	

}
