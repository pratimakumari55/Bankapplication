package com.org.transaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.transaction.entity.Transaction;
import com.org.transaction.service.TransactionService;

@RestController
@RequestMapping(name="/transaction")
public class TransactionController {

	@Autowired
	   private TransactionService service;
	@PostMapping("/save")
	public ResponseEntity<String> saveAllTransaction(@RequestBody Transaction t)
	{
		Long id=service.saveTransaction(t);
		
		String message="Transaction'"+id+"' Done";
		return new ResponseEntity<String>(message,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/show/{id}")
	public ResponseEntity<Transaction> getOneTransaction(@PathVariable Long id)
	{
		
	   Transaction tran=	service.getById(id);
	  
	   return new ResponseEntity<Transaction>(tran,HttpStatus.OK);
	}

	@GetMapping("/all")
	public ResponseEntity<List<Transaction>> fetchAllRecord()
	{
		List<Transaction> record=service.showTransaction();
		return new ResponseEntity<List<Transaction>>(record,HttpStatus.OK);
		
	}
}
