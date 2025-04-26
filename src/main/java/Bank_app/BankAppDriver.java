package Bank_app;

import Menu.BankAppMenu;
import java.util.Scanner;

public class BankAppDriver {
    private Bank bank;

    public BankAppDriver(Bank bank){
        this.bank = bank;
    }
    public void showMainMenu(){
        Scanner sc = new Scanner(System.in);
        boolean shouldContinue = true;

        while (shouldContinue){
            //BankAppMenu.showMainMenu(this.bank.getName());
            int selectedOption = sc.nextInt();

            switch (selectedOption){
                case 1-> {
                    //BankAccount newAccount = this.crea
                }
            }
        }
    }
}
