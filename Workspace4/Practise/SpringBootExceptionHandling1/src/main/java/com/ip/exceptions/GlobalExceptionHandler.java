package com.ip.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.ip.model.MyErrorDetails;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
		@ExceptionHandler(InvalidIdException.class)
        public ResponseEntity<MyErrorDetails> InvalidIdExceptionHandler(InvalidIdException ie, WebRequest req) {
        	
        	MyErrorDetails err = new MyErrorDetails();
        	err.setTimeStamp(LocalDateTime.now());
        	err.setMessage(ie.getMessage());
        	err.setDetails(req.getDescription(false));
        	
        	return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
        }
		
		@ExceptionHandler(Exception.class)
		public ResponseEntity<MyErrorDetails> ExceptionHandler(Exception e, WebRequest req) {
			
			MyErrorDetails err = new MyErrorDetails();
        	err.setTimeStamp(LocalDateTime.now());
        	err.setMessage(e.getMessage());
        	err.setDetails(req.getDescription(false));
        	
        	return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
			
		}
		
		@ExceptionHandler(NoHandlerFoundException.class)
		public ResponseEntity<MyErrorDetails> NoHandlerFoundExceptionHandler(NoHandlerFoundException ne, WebRequest req) {
			MyErrorDetails err = new MyErrorDetails();
        	err.setTimeStamp(LocalDateTime.now());
        	err.setMessage(ne.getMessage());
        	err.setDetails(req.getDescription(false));
        	
        	return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
		}

}
