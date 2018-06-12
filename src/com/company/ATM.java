package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ATM {
    private Integer accntHolderNum;
    private String accntPin;
    private String options;
    private double custMoney;
    Scanner input= new Scanner(System.in);
    Account userA= new Account(1632,"James",124000,"palmTree");
    Account userB= new Account(1425,"Bradly",152000,"pinkTree");
    Account userC= new Account(1728,"Mark",250000,"bigTree");
    Account userD= new Account(1632,"Daniel",87000,"smallTree");
    Map<Integer,Account> userAccount= new HashMap<>();

    public void accountBuilder(){
        userAccount.put(1632,userA);
        userAccount.put(1425,userB) ;
        userAccount.put(1728,userC);
        userAccount.put(1632,userD) ;
    }
    public void customerService(){
        System.out.println("WELCOME TO XYZ BANK");
        System.out.println("Please Enter the Accoount and Password");
        accntHolderNum=input.nextInt();
        System.out.println("and PASSWORD");
        accntPin=input.nextLine();
        if(accountVerifier(accntHolderNum,accntPin)){


            Account workingAcount=userAccount.get(accntHolderNum);


                workingAcount.accountInfoDisplay();
                System.out.println("what do you want to do with your account ?");
                System.out.println("please select from the below choices");
                System.out.println("(1)-WITHDRAW  , (2)- DEPOSIT");
                options= input.nextLine();
                System.out.println(opsSelector(options));
                custMoney=input.nextDouble();
                System.out.println(" Your new Balance will be " + accoutTransaction(options,custMoney,workingAcount));

        }

    }

public  double accoutTransaction(String choice,double trans,Account acct){
    switch (choice.toLowerCase())
    {

        case"withdrawal" : double balanceWith=acct.getBalance()-trans;
            acct.setBalance(balanceWith);


            break;
        case"deposit": double balanceDep=acct.getBalance()+trans;
            acct.setBalance(balanceDep);


    }
    return acct.getBalance();
}

public double accoutDeposit(double depo,Account acct){
    double balance=acct.getBalance()+depo;


            return acct.getBalance();
}

    public double accoutWithdrawal(double withd,Account acct){
        double balance=acct.getBalance()-withd;
        acct.setBalance(balance);

        return acct.getBalance();
    }
    public boolean accountVerifier(int acct,String pin){
        if(userAccount.containsKey(acct) && userAccount.get(acct).getPin().equalsIgnoreCase(pin))
           return true;
        else
            return false;
    }
    public Account accountOpener(String acctName){
       return userAccount.get(acctName);
    }
    public String opsSelector(String choice){
        String displayMessge=new String();
        switch (choice.toLowerCase()){

            case"withdrawal" : displayMessge="PLEASE Enter the amount of money to withdraw";
            break;
            case"deposit": displayMessge="Please Enter the amount money youw ant to deposit in your account";

        }
        return displayMessge;
    }

}


//    private int accountNum;
//    private  String userName;
//    private double balance;