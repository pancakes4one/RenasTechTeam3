package Hamsa.assignments20;

import MyUtil.Lines;

public class BankAccount2 {
    static String accountHolder;
    static int accountNumber;
    Double balance;

    public static void main(String[] args) {
        BankAccount2 account=new BankAccount2("hamsa elyas",652452,2000.00);
        account.showBalance();
        Lines.Shape1();
        account.deposit(500.00);
        account.showBalance();
        Lines.Shape1();

    }

    public void deposit(Double amount) {
        balance += amount;
 //       System.out.println(accountHolder + " you just deposit " + amount + " US Dollars into your account " + accountNumber);
    }


    public Double showBalance() {
//        System.out.println(accountHolder + " your account has a balance of $" + balance);
        return balance;
    }


    public String toString(String accountHolder, int accountNumber, Double balance) {
        return accountHolder + " you account number " + accountNumber + " has a balance of $" + balance;
    }


    public BankAccount2(String accountHolder,int accountNumber,Double balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
//variables: accountNumber, accountHolder, balance, interestRate     methods: deposit, showBalance
    class savingAccount {
    Double interestRate;

    }

    class checkingAccount{

    }

    class AccountObject{
       savingAccount savingAcc1=new savingAccount();
       checkingAccount checkingAcc1=new checkingAccount();

    }




}








    //Task BankAccount
//create a class called BankAccount
//       variables:  accountNumber, accountHolder, Balance
//       methods: deposit, showBalance, toString
//
// create sub class of BankAccount and name it SavingAccount
//       variables: accountNumber, accountHolder, balance, interestRate
//       methods: deposit, showBalance
//
// create sub class of BankAccount and name it checkingAccount
//       variables: accountNumber, accountHolder, balance
//       methods: deposit, withDraw, showBalance
//then create a class called AccountObject
//          create objects for SavingAccount and checkingAccount class and do practice on methods and variables


