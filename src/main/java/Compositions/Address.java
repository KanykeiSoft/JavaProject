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
        addreddString += "\ncity = "+ city;
        addreddString += "\nstate = " + street;
        addreddString += "\ncountry = "+ country;
        addreddString += "\nzipCode = " + zipCode;
        addreddString +="\n====================\n";

        return addreddString;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}
