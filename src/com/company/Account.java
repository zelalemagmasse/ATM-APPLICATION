package com.company;

public class Account {
    private int accountNum;
    private  String userName;
    private double balance;
    private String pin;

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }


    public Account() {
    }

    public Account(int accountNum, String userName, double balance, String pin) {
        this.accountNum = accountNum;
        this.userName = userName;
        this.balance = balance;
        this.pin = pin;

    }
    public void accountInfoDisplay(){
        System.out.printf("Welcom again %s here is your account infomation. %n ACCOUNT NUMBER %d%n USER NAME %s%n BALALNCE %.2f%n",this.userName,this.accountNum,this.userName,this.balance);
    }


}
