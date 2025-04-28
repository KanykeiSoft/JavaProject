package GrowthHungry;

public class Payment_Main {
    public static void main(String[] args) {
        CreditCardPayment card = new CreditCardPayment();
        card.setCardNumber(24242);
        card.setCardHolderName("qwert");
        card.setBalance(0);
        System.out.println(card);


    }
}
