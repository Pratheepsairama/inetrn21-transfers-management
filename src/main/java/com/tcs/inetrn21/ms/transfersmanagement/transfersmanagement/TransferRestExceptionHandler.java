package com.tcs.inetrn21.ms.transfersmanagement.transfersmanagement;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
public class TransferRestExceptionHandler {
	@ExceptionHandler
	public ResponseEntity<TransferErrorResponsePage> handleException(TransferNotFoundExceptionClass exc)
	{
		TransferErrorResponsePage error = new TransferErrorResponsePage(HttpStatus.NOT_FOUND.value(),
				                              exc.getMessage(),
				                              System.currentTimeMillis());
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<TransferErrorResponsePage> handleException(Exception exc)
	{
		TransferErrorResponsePage error = new TransferErrorResponsePage(HttpStatus.BAD_REQUEST.value(),
				                              exc.getMessage(),
				                              System.currentTimeMillis());
		return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
	}

}
