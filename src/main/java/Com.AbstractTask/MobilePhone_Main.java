package Com.AbstractTask;

import ModelsPhones.Sumsung;
import ModelsPhones.Zyrex;

public class MobilePhone_Main {
    public static void main(String[] args) {
        ImportedMobile samsung = new Sumsung();
        samsung.setModel("Note 20");
        samsung.setRam(12);
        samsung.setProcessor("Snapdragon ");
        samsung.setStorage(128);
        samsung.setPrice(1100);
        System.out.println(samsung);
        System.out.println();

        LocalMobile zyrexx = new Zyrex( );
        zyrexx.setModel("zyrex");


    }

}
