package GrowthHungry;

import java.util.Random;

public class Payable_Processor {
    public static void paymentProcessor(Payable[] payment){
        Random rd = new Random();

        for(Payable payables : payment){
            double amount = 1 + rd.nextDouble() * 99;
            payables.pay(amount);
        }


    }
}
