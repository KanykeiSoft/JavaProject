package ModelsPhones;

import Com.AbstractTask.LocalMobile;

public  class Zyrex extends LocalMobile {
 public Zyrex(){
     this.setCompany("Zyrex");}

    public Zyrex(String model, String company,
                 int ram,
                 String processor,
                 int storage,
                 double price
                 ){
                 super(model,company,ram,processor,storage,price);
    }

    @Override
    public String toString() {
        return "Zyrex{" + "model = " + this.getModel() + ", company = " + this.getCompany() + ", price = "+ this.getPrice()+ "}";
    }
}
