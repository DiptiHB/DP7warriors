package com.daoclass;
import java.sql.SQLException;
import java.util.List;
import com.pojo.*;
public interface AccountDao {
	public boolean deposit(String contact, double amt) throws Exception,SQLException;

	public boolean withdraw(String contact, double amt) throws Exception,SQLException;
	
	public boolean transaction(String contact,String t_contact, double amt) throws Exception,SQLException;

	public double showBalance(String contact) throws Exception,SQLException;
	
	List<Transaction> showTransactions(String email) throws Exception,SQLException;
}
