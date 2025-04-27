package Compositions;

public class Composition_Main {
    public static void main(String[] args) {
        Company acme = new Company("acme", "www.acme-inc.com",6);
        Address companyAddress = new Address();
        companyAddress.setStreet("2324 Holly");
        companyAddress.setState("Ohio");
        companyAddress.setCity("Colunbus");
        companyAddress.setZipCode(1233);
        companyAddress.setCountry("USA");
        acme.setAddress(companyAddress);

        acme.setAddress(companyAddress);

        Department security = new Department(
                "Security",
                "Responsible",
                20
        );

     Employee1 mike = new Employee1(1,"mike", 35);

     Address mikeAddress = new Address();

     mikeAddress.setStreet("2324 Holly");
     mikeAddress.setState("Ohio");
     mikeAddress.setCity("Colunbus");
     mikeAddress.setZipCode(1233);
     mikeAddress.setCountry("USA");

     //mike.setAddress(mikeAddress);


    security.addEmployee(mike);
    acme.AddDepartment(security);
        System.out.println(acme);


    }
}
