package com.UserService.Services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import com.UserService.Entity.User;
import com.UserService.Exceptions.ResourceNotFoundException;
import com.UserService.UserRepository.UserRepo;
@Service
public class UserServicesImp  implements UserServices{
	
	
	@Autowired
	private UserRepo userRepo ; 
	
	
	@Override
	public User saveUser(User user) {
		user.setUserId(UUID.randomUUID().toString());
	return	userRepo.save(user);
		 
	}

	@Override
	public List<User> getAllUser() {
		return this.userRepo.findAll();
		}

	@Override
	public User getUser(String UserId) {
		 
		return this.userRepo.findById(UserId).orElseThrow(()-> new ResourceNotFoundException(UserId + " UserId Not found exception !!!"));
	}

}













