package Bank_app;

public class Bank {
    private String name;
    private String address;
    private String accNumberPrefix;
    private int nextAccNumber;
    private BankAccount[] account;
    private int index;
    public Bank(String name, String accNumberPrefix){
        this.name = name;
        this.accNumberPrefix = accNumberPrefix;

    }

}
