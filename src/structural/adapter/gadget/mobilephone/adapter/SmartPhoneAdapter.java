package structural.adapter.gadget.mobilephone.adapter;

import structural.adapter.gadget.mobilephone.IMobilePhone;
import structural.adapter.gadget.smartphone.ISmartPhone;

public class SmartPhoneAdapter implements ISmartPhone{
    private final IMobilePhone mobilePhone;
    
    public SmartPhoneAdapter(IMobilePhone mobilePhone) {
        super();
        this.mobilePhone = mobilePhone;
    }

    @Override
    public void call() {
        mobilePhone.call();
    }

    @Override
    public void videoCall() {
        System.out.println("video call not avalible");
    }

    @Override
    public void sendMessage() {
        mobilePhone.sendMessage();
    }

    @Override
    public void sendImageMessage() {
        mobilePhone.sendImageMessage();
    }

    @Override
    public void getMessage() {
        mobilePhone.getMessage();
    }

    @Override
    public void getImageMessage() {
        mobilePhone.getImageMessage();
    }

    @Override
    public void makeVideo() {
        mobilePhone.makeVideo();
    }

    @Override
    public void makePhoto() {
        mobilePhone.makePhoto();
    }

    @Override
    public void surfInternet() {
        System.out.println("internet not avalible");
    }

}
