package com.daoclass;
import java.util.ArrayList;
import java.util.List;

import com.pojo.*;
public class BankTransaction {
	private List<User> users;
    private List<Account> accounts;
    private List<Transaction> transactions;
    private User currentUser; 

    public BankTransaction() {
        users = new ArrayList<>();
        accounts = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    public void signUp(User user) {
        users.add(user);
    }

    public boolean login(String userName, String adharCard) {
        for (User user : users) {
            if (user.getUserName().equals(userName) && user.getAdharCard().equals(adharCard)) {
                currentUser = user;
                return true;
            }
        }
        return false;
    }

    public void logout() {
        currentUser = null;
    }

    public void deposit(double amount) {
        if (currentUser != null) {
          
            for (Account account : accounts) {
                if (account.getAccountNo().equals(currentUser.getUserName())) {
                    account.setBalance(account.getBalance() + amount);
                    transactions.add(new Transaction("Deposit", account.getAccountNo(), "TransactionDate", "Success", amount));
                    return;
                }
            }
        }
    }

    public void withdraw(double amount) {
        if (currentUser != null) {
           
            for (Account account : accounts) {
                if (account.getAccountNo().equals(currentUser.getUserName())) {
                    if (account.getBalance() >= amount) {
                        account.setBalance(account.getBalance() - amount);
                        transactions.add(new Transaction("Withdraw", account.getAccountNo(), "TransactionDate", "Success", amount));
                    } else {
                        transactions.add(new Transaction("Withdraw", account.getAccountNo(), "TransactionDate", "Failed", amount));
                    }
                    return;
                }
            }
        }
    }

    public double checkBalance() {
        if (currentUser != null) {
           
            for (Account account : accounts) {
                if (account.getAccountNo().equals(currentUser.getUserName())) {
                    return account.getBalance();
                }
            }
        }
        return -1; 
    }


}
