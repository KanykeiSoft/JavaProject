package Bank_app;

public class CheckingAccount extends BankAccount{
    private static final double TRANSACTION_FEE = 1.5;
    private static final String ACCOUNT_TYPE = "Checking";


    public CheckingAccount(BankAccountOwner accountOwner, String accNumber, double balance){

        //super(accountOwner,balance,accNumber);
    }

    @Override
    public void withdraw(double amount) {

    }
}
