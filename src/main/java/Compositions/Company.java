package Compositions;

import java.time.LocalDate;

import javax.swing.*;

public class Company {
    private String name;
    private String website;
    private Address address;
    private LocalDate establishedIn;
    private Department[] departments;
    private int index = 0;
    private int totalDepartments;

    public Company(String name, String website, Address address, int totalDepartments){
        this.name = name;
        this.website = website;
        this.totalDepartments = totalDepartments;
    }


}
