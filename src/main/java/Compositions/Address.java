package Compositions;

public class Address {
    private String street;
    private String city;
    private String state;
    private String country;
    private int zipCode;

    @Override
    public String toString() {
        String addreddString = "";

        addreddString +="\n====================\n";
        addreddString += "\tAddress\n";
        addreddString += "======================\n";
        addreddString += "street = " + street;
    }
}
