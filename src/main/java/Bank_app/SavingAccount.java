package Bank_app;

import java.security.PublicKey;

public class SavingAccount extends BankAccount{
    public static final double ANNUAL_INTEREST_RATE=3.2;
    private static final String ACCOUNT_TYPE = "Savings";

    public SavingAccount(BankAccountOwner accountOwner, String accNumber, double balance){
        super(accountOwner, accNumber,balance, SavingAccount.ACCOUNT_TYPE);
    }
    public SavingAccount(BankAccountOwner accountOwner, String accNumber) {
        super(accountOwner, accNumber, ACCOUNT_TYPE);

    }
    public void depositAnnualProfit(){
        double totalAmountAdd = (this.getBalance() * SavingAccount.ANNUAL_INTEREST_RATE);
        double  newBalance = this.getBalance() * totalAmountAdd;
        this.setBalance(newBalance);
        System.out.println("=========================");
        System.out.println("Accont No.:" + this.getAccNumber());
        System.out.println("Balance before profit: $" + (newBalance));
        System.out.println("Amount added: $" +totalAmountAdd);
        System.out.println("Current balance: $ "+ newBalance);
    }

    @Override
    public void withdraw(double amount) {
        double balance = this.getBalance();
        if(amount > balance){
            System.out.println("Withdraw failed - not enough balance");
        }else{
            balance -=amount;
            this.setBalance(balance);
            System.out.println("Withdraw successful");
            System.out.println("Amount withdrawn: $ " + amount);
        }
    }
}
