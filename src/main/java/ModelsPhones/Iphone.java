package ModelsPhones;

import Com.AbstractTask.ImportedMobile;

public class Iphone extends ImportedMobile {
    public Iphone() {
        this.setCompany("Samsung");

    }

    public Iphone(String model, String company,
                   int ram,
                   String processor,
                   int storage,
                   double price,
                   double importDuty) {

        super(model, company, ram, processor, storage, price, importDuty);

    }

}
