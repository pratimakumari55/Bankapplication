package com.org.transaction.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "transaction")
public class Transaction{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tran_id")
	private Long transid;

	@Column(name = "date")
	private Date date;

	@Column(name = "trans_type")
	private String transType;

	@Column(name = "amount")
	private Double amount;

	public Long getTransid() {
		return transid;
	}

	public void setTransid(Long transid) {
		this.transid = transid;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Transaction [transid=" + transid + ", date=" + date + ", transType=" + transType + ", amount=" + amount
				+ "]";
	}

	public Transaction(Long transid, Date date, String transType, Double amount) {
		super();
		this.transid = transid;
		this.date = date;
		this.transType = transType;
		this.amount = amount;
	}

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
