package GrowthHungry;

import java.util.Random;

public class CreditCardPayment implements Payable{
    private int cardNumber;


    @Override
    public void pay(double amount) {
        System.out.println("ss \n" +amount, ca);
    }

//    @Override
//    public void refund(double amount) {
//
//    }
//
//    public void chargeAll(Payable[] payables) {
//        Random random = new Random();
//        for (Payable p : payables) {
//            double amount = random.nextInt(100) + 1; // от 1 до 100
//            p.pay(amount);
//        }
//
//
//    }
//
//    public static void main(String[] args) {
//        Payable[] p = {
//                new CreditCardPayment("Клиент A"),
//                new CreditCardPayment("Клиент B"),
//                new CreditCardPayment("Клиент C")
//        };
//
//        chargeAll(p);
        }


