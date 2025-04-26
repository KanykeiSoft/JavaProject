package ModelsPhones;

import Com.AbstractTask.ImportedMobile;

public class Sumsung extends ImportedMobile {

    public Sumsung() {
        this.setCompany("Samsung");

    }

    public Sumsung(String model, String company,
                   int ram,
                   String processor,
                   int storage,
                   double price,
                   double importDuty) {

        super(model, company, ram, processor, storage, price, importDuty);

    }

}

