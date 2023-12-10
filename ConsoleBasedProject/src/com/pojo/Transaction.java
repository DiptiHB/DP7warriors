package com.pojo;
import java.util.Date;
public class Transaction {
	private String transactionType;
	private String accountNo;
	private String transactionDate;
	private String status;
	private double transactionAmount;
	public Transaction() {
		super();
	}
	public Transaction(String transactionType, String accountNo, String transactionDate, String status,
			double transactionAmount) {
		super();
		this.transactionType = transactionType;
		this.accountNo = accountNo;
		this.transactionDate = transactionDate;
		this.status = status;
		this.transactionAmount = transactionAmount;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	@Override
	public String toString() {
		return "Transaction [transactionType=" + transactionType + ", accountNo=" + accountNo + ", transactionDate="
				+ transactionDate + ", status=" + status + ", transactionAmount=" + transactionAmount + "]";
	}
	
	
	

}
