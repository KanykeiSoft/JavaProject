package Com.AbstractTask;

import java.security.PublicKey;

public abstract class LocalMobile extends MobilePhone{
    public LocalMobile(){}

    public LocalMobile(
            String model,
            String company,
            int ram,
            String processor,
            int storage,
            double price){

       super(model,company,ram,processor,storage,price);


    }

    @Override
    public double calculatePrice() {
        return this.getPrice();
    }
}
