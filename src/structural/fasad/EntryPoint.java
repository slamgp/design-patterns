package structural.fasad;

import structural.fasad.system.AccountingSystem;
import structural.fasad.system.DeliverySystem;
import structural.fasad.system.WareHouseSystem;

public class EntryPoint {

    public static void main(String[] args) {
        WareHouseSystem whSystem = new WareHouseSystem();
        DeliverySystem deliverySystem = new DeliverySystem();
        AccountingSystem accountingSystem = new AccountingSystem();
        FasadOrder order = new FasadOrder(whSystem, deliverySystem, accountingSystem);
        order.makeOrder();
        System.out.println("--------------");
        order.revertOrder();
    }

}
