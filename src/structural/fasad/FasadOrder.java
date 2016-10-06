package structural.fasad;

import structural.fasad.system.AccountingSystem;
import structural.fasad.system.DeliverySystem;
import structural.fasad.system.WareHouseSystem;

public class FasadOrder {
    private WareHouseSystem whSystem;
    private DeliverySystem deliverySystem;
    private AccountingSystem accountingSystem;

    public FasadOrder(WareHouseSystem whSystem, DeliverySystem deliverySystem, AccountingSystem accountingSystem) {
        super();
        this.whSystem = whSystem;
        this.deliverySystem = deliverySystem;
        this.accountingSystem = accountingSystem;
    }

    public void makeOrder() {
        whSystem.checkBalances();
        whSystem.reservProduct();

        accountingSystem.prepareDocuments();
        accountingSystem.presentDocuments();
 
        whSystem.shipment();
        deliverySystem.downloadProduct();

        deliverySystem.deliveryProduct();
        deliverySystem.unloadProduct();
    }

    public void revertOrder() {
        whSystem.reservProduct();
        accountingSystem.prepareDocuments();
        deliverySystem.unloadProduct();
    }
}
