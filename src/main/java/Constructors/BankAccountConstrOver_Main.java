package Constructors;

public class BankAccountConstrOver_Main {
    public static void main(String[] args) {

   BankAccount_ConstrOver kokaAccount = new BankAccount_ConstrOver();
   kokaAccount.setAccountTitle("Kkoka");
   BankAccount_ConstrOver aidarAccount = new BankAccount_ConstrOver("Aidar" ,200);
     kokaAccount.printAccountDetails();
     aidarAccount.printAccountDetails();
    }
}
