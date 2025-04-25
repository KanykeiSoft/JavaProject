package Com.AbstractTask;

public abstract class ImportedMobile extends MobilePhone{
    private double importDuty;
    public ImportedMobile(){

    }
    public ImportedMobile(

            String model,
            String company,
            int ram,
            String processor,
            int storage,
            double price,
            double importDuty

            ){
        super(model,company,ram,processor,storage,price);
        this.importDuty = importDuty;

    }

    @Override
    public String toString() {
        return super.toString() + "{ImportDuty = % " + importDuty + "}";
    }

    @Override
    public double calculatePrice() {
        double importDutyPercentage = (this.getPrice()* this.importDuty)/ 100;
        return this.getPrice() + importDutyPercentage;
    }

    public double getImportDuty() {
        return importDuty;
    }

    public void setImportDuty(double importDuty) {
        this.importDuty = importDuty;
    }
}
