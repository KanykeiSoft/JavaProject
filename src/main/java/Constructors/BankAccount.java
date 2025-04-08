package Constructors;

import java.sql.SQLOutput;

public class BankAccount {
    private String accountTitle;
    private double balance;


public BankAccount(){
    accountTitle = "untitled";
    balance =0;
}

public void deposit(double amount){

    balance = balance+amount;
    System.out.println("Amount deposited: $ " + amount);
    printAvailableBalance();

}
public void withdraw(double amount){
    System.out.println("WithDraw amount: $" +amount);
    if (balance < amount){
        System.out.println("Error: you do not have sufficient balance");
    }
}

private void printAvailableBalance(){
    System.out.println("Available Balance: $" + balance);
}


}
