package Book_Contact;

import java.util.Scanner;

public class PhoneBookDrive {
    private final Scanner scanner;
    private final PhoneBook phonebook;

    public PhoneBookDrive() {
        this.scanner = new Scanner(System.in);
        this.phonebook = new PhoneBook();
    }
    public void addNewContact(){
        System.out.println("Enter contact name: ");
        String contactName = this.scanner.nextLine();

        System.out.println("Enter contact number:");
        String contactNumber = this.scanner.nextLine();

        Contact newContact = new Contact(contactName, contactNumber);
        this.phonebook.addContact(newContact);

    }
    public void removeContact(){
//        String contactNumber = this.takeContactNumber();
//        this.phonebook.addContact(newContact);
   }
}
