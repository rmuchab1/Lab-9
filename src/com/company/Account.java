package com.company;

public class Account {
    private static int balance;
    private static String owner, accountNumber;

    Account(int balance, String owner, String accountNumber) {
        Account.balance = balance;
        Account.owner = owner;
        Account.accountNumber = accountNumber;
    }

    Account() {
        super();
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public static void Cal(int withdraw) {
        int result = balance > withdraw ? balance -= withdraw : balance;
        System.out.println("Total balance: " + result);
    }
}

class NotEnoughMoney extends Exception {
    public NotEnoughMoney() {
        super("Not enough money to withdraw, please check the balance carefully.");
    }

    public NotEnoughMoney(String message) {
        super(message);
    }
}
