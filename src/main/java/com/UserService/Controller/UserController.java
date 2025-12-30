package com.UserService.Controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UserService.Entity.User;
import com.UserService.Services.UserServicesImp;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserServicesImp userServicesImp ;
	
	@PostMapping("/save")
	public ResponseEntity<User>saveUser(@RequestBody User user){
		this.userServicesImp.saveUser(user);
		return ResponseEntity.ok(user);
	}
	@GetMapping("/{userId}")
	public ResponseEntity<User> getSingleUser(@PathVariable String userId){
				User user=this.userServicesImp.getUser(userId);
				return ResponseEntity.ok(user);
	}
	
	@GetMapping
	public List<User> getAlldata (){
		
		List<User> user =  this.userServicesImp.getAllUser();
		return user;
	}
	
	
}
