package com.ip.Exeptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(StudentException.class)
	public ResponseEntity<ErrorDetails> studentException(StudentException se, WebRequest wr) {
		ErrorDetails ed = new ErrorDetails(LocalDateTime.now(), 
				se.getMessage(), wr.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(ed, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<ErrorDetails> noHandlerFoundException (NoHandlerFoundException ne, WebRequest wr) { 
		ErrorDetails ed = new ErrorDetails(LocalDateTime.now(), 
				ne.getMessage(), wr.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(ed, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorDetails> myMANVException(MethodArgumentNotValidException mv) {
		ErrorDetails ed = new ErrorDetails(LocalDateTime.now(), "Validataion Error", 
				mv.getBindingResult().getFieldError().getDefaultMessage());
		return new ResponseEntity<ErrorDetails>(ed, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> ExceptionHandler(Exception e, WebRequest wr) {
		
		ErrorDetails ed = new ErrorDetails(LocalDateTime.now(), 
				e.getMessage(), wr.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(ed, HttpStatus.BAD_REQUEST);
		
	}
	
	
}
