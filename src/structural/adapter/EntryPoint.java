package structural.adapter;

import structural.adapter.gadget.mobilephone.IMobilePhone;
import structural.adapter.gadget.mobilephone.Nokia2110;
import structural.adapter.gadget.mobilephone.adapter.SmartPhoneAdapter;
import structural.adapter.gadget.service.GadgetManager;
import structural.adapter.gadget.smartphone.ISmartPhone;
import structural.adapter.gadget.smartphone.XiomiRedmi;

public class EntryPoint {

    public static void main(String[] args) {
        ISmartPhone redmi3 = new XiomiRedmi();
        GadgetManager manager = new GadgetManager(redmi3);
        manager.surfInternet();
        manager.call(true);
        manager.sendMessage(true);
        System.out.println("-----------------------");

        IMobilePhone phone2110 = new Nokia2110();
        SmartPhoneAdapter adapter = new SmartPhoneAdapter(phone2110);
        // manager.setGadget(phone2110);
        manager.setGadget(adapter);
        manager.surfInternet();
        manager.call(true);
        manager.sendMessage(true);
    }

}
