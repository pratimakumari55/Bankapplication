package com.org.transaction.service;

import java.util.List;

import com.org.transaction.entity.Transaction;

public interface TransactionService {
        Long  saveTransaction(Transaction t);
        List<Transaction>  showTransaction();
        Transaction getById(Long id);
}
