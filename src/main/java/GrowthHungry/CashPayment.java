package GrowthHungry;

public class CashPayment implements Payable{
    public CashPayment(){

    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment succesful" + amount);



    }

    @Override
    public void refund(double amount) {
        System.out.println("Returngndgbdg" + amount);
    }
}
