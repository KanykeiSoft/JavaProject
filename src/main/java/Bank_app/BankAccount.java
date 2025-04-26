package Bank_app;

import java.security.PublicKey;

public abstract class BankAccount {
    private BankAccountOwner accountOwner;
    private String accNumber;
    private double balance;
    private String accType;

    public BankAccount(){}

    public BankAccount(BankAccountOwner accountOwner,
                       String accNumber,
                       double balance,
                       String accType) {

        this.accNumber = accNumber;
        this.accountOwner = accountOwner;
        this.balance = balance;
        this.accType = accType;

    }

    public BankAccount(BankAccountOwner accountOwner, String accNumber, String accType) {
        this.accNumber = accNumber;
        this.accountOwner = accountOwner;
        this.balance = 0;
        this.accType = accType;


    }
    public abstract void withdraw(double amount);

    public void deposit(double amount){
        if(amount <=0 ){
            System.out.println("Deposit Failed: Deposit amount should be greater than 0 !");
            return;
        }
        this.balance += amount;
        System.out.println("DepositSuccessful");
        System.out.println("Amount added: $" + amount);
        System.out.println("Current balance: $ " + this.balance);
    }
    public void showACCountInfo(){
        System.out.println("===================");
        System.out.println("\t\tAccount");
        System.out.println("===================");
        //this.accountOwner.showInfo();
        System.out.println("Account  No.: " + this.accountOwner);
        System.out.println("Account  Type.: " + this.accType);
        System.out.println("Balance: $" + this.balance);


    }
    public BankAccountOwner getAccountOwner(){
        return accountOwner;
    }
    public void setAccountOwner(BankAccountOwner accountOwner){
        this.accountOwner =accountOwner;
    }
    public String getAccNumber(){
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}


