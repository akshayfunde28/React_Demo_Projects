
package com.UserService.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.UserService.payLoad.ApiResponses;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponses> handlerResourseNotFoundException(ResourceNotFoundException ex){
	 ApiResponses response = new ApiResponses();
	 response.setMessage(ex.getMessage());
	 response.setStatus(HttpStatus.NOT_FOUND);
	 response.setSuccess(true);
		return new ResponseEntity<ApiResponses>(response,HttpStatus.NOT_FOUND);
	}
	
	
}
