package com.org.transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.transaction.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
