package GrowthHungry;

import java.util.Random;
import java.util.Scanner;
public  class CreditCardPayment implements Payable{
    Scanner sc= new Scanner(System.in);

    protected int cardNumber;
    private String cardHolderName;
    private double balance;

    public CreditCardPayment(){}

    public CreditCardPayment(int cardNumber, String cardHolderName, double balance) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.balance = balance;
    }

    @Override
    public void pay(double amount) {
        if(balance >= amount ){
            balance = balance -amount;
            System.out.println("Payment successful!");
        }else {
            System.out.println("Not enough balance!");

        }


    }

    @Override
    public void refund(double amount) {

    }

    @Override
    public String toString() {
        String paymentString = "";
        paymentString += "======================\n";
        paymentString += "CardHolderName =" + cardHolderName;
        paymentString += "\nCardNumber = "+ cardNumber;
        paymentString += "\nbalance = "+ balance;
        return paymentString;

    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public double getBalance() {
        return balance;
    }
}

//    public static void main(String[] args) {
//        Payable[] p = {
//                new CreditCardPayment("Клиент A"),
//                new CreditCardPayment("Клиент B"),
//                new CreditCardPayment("Клиент C")
//        };
//
//        chargeAll(p);



