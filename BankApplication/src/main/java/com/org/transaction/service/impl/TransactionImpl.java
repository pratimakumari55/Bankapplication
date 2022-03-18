package com.org.transaction.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.transaction.entity.Transaction;
import com.org.transaction.exception.RecordNotFondException;
import com.org.transaction.repository.TransactionRepository;
import com.org.transaction.service.TransactionService;

@Service
public class TransactionImpl implements TransactionService {

	@Autowired
	private TransactionRepository transactionRepository;
	
	
	@Override
	public Long saveTransaction(Transaction t) {
		 
		t=transactionRepository.save(t);
		return t.getTransid();
	}

	@Override
	public List<Transaction> showTransaction() {
		// TODO Auto-generated method stub
	transactionRepository.findAll();
		return transactionRepository.findAll();
	}

	@Override
	public Transaction getById(Long id) {
		// TODO Auto-generated method stub
		      return transactionRepository.findById(id).orElseThrow(()->new RecordNotFondException("Transaction '"+id+"' not exist"));
		
	}

}
