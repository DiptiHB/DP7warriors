package com.test;
import java.util.*;
import com.pojo.*;
 
public class BankService {
	    private List<User> users;
	    private List<Account> accounts;
	    private List<Transaction> transactions;
	    private User currentUser; 

	    public BankService() {
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

	    public static void main(String[] args) {
	        BankService bankService = new BankService();
	        User user1 = new User("User1", "123456789", "ABC123", "user1@example.com", "1234567890", "User1 Address");
	        bankService.signUp(user1);

	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.println("1. Login");
	            System.out.println("2. Signup");
	            System.out.println("3. Logout");
	            System.out.println("4. Deposit");
	            System.out.println("5. Withdraw");
	            System.out.println("6. Check Balance");
	            System.out.println("7. Exit");

	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter username: ");
	                    String username = scanner.next();
	                    System.out.print("Enter Adhar card: ");
	                    String adhar = scanner.next();
	                    if (bankService.login(username, adhar)) {
	                        System.out.println("Login successful!");
	                    } else {
	                        System.out.println("Login failed. Please check your username and Adhar card.");
	                    }
	                    break;

	                case 2:
	                	 
	                     System.out.print("Enter Adhar card: ");
	                     String newAdhar = scanner.nextLine();
	                     System.out.print("Enter username: ");
	                     String newUsername = scanner.nextLine();
	                     System.out.print("Enter PAN card: ");
	                     String newPAN = scanner.nextLine();
	                     System.out.print("Enter email: ");
	                     String newEmail = scanner.nextLine();
	                     System.out.print("Enter mobile number: ");
	                     String newMobileNumber = scanner.next();
	                     scanner.nextLine(); // Consume the newline character
	                     System.out.print("Enter address: ");
	                     String newAddress = scanner.nextLine();

	                     User newUser = new User(newUsername, newAdhar, newPAN, newEmail, newMobileNumber, newAddress);
	                     bankService.signUp(newUser);
	                     System.out.println("Sign Up successful!");
	                     break;
	                   

	                case 3:
	                    bankService.logout();
	                    System.out.println("Logged out successfully.");
	                    break;

	                case 4:
	                    if (bankService.checkBalance() >= 0) {
	                        System.out.print("Enter the deposit amount: ");
	                        double depositAmount = scanner.nextDouble();
	                        bankService.deposit(depositAmount);
	                        System.out.println("Deposit successful.");
	                    } else {
	                        System.out.println("Please log in first.");
	                    }
	                    break;

	                case 5:
	                    if (bankService.checkBalance() >= 0) {
	                        System.out.print("Enter the withdrawal amount: ");
	                        double withdrawAmount = scanner.nextDouble();
	                        bankService.withdraw(withdrawAmount);
	                        System.out.println("Withdrawal successful.");
	                    } else {
	                        System.out.println("Please log in first.");
	                    }
	                    break;

	                case 6:
	                    if (bankService.checkBalance() >= 0) {
	                        double balance = bankService.checkBalance();
	                        System.out.println("Your account balance is: " + balance);
	                    } else {
	                        System.out.println("Please log in first.");
	                    }
	                    break;

	                case 7:
	                    System.out.println("Exiting the application.");
	                    scanner.close();
	                    System.exit(0);
	                    break;
	            }
	        }
	    }

}
