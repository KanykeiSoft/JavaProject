package Bank_app;

import java.sql.SQLOutput;

import javax.swing.plaf.PanelUI;

public class CurrentAccount extends BankAccount{
    private static final String ACCOUNT_TYPE = "Current";
    private static final int NEGATIVE_BALANCE_LIMIT =-2000;

    public CurrentAccount(BankAccountOwner accountOwner, String accNumber, double balance){
        super(accountOwner, accNumber, balance, ACCOUNT_TYPE);
    }

    public CurrentAccount(BankAccountOwner accountOwner,  String accNumber){
        super(accountOwner, accNumber, CurrentAccount.ACCOUNT_TYPE);
    }

    @Override
    public void withdraw(double amount) {
        double balance  = this.getBalance();

        if((balance - amount) < CurrentAccount.NEGATIVE_BALANCE_LIMIT){
            System.out.println("Withdraw Failed - limit outstanding amount is $" +  CurrentAccount.ACCOUNT_TYPE);
        }
        else{
            balance -=amount;
            this.setBalance(balance);

            System.out.println("Withdraw Successful");
            System.out.println("Amount withdrawn: $" + amount);
            System.out.println("Current balance: $ " +balance);

        }

    }
}
