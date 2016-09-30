package structural.adapter.gadget.mobilephone;

public class Nokia2110 implements IMobilePhone {
    @Override
    public void call() {
        System.out.println("nokia call");
    }

    @Override
    public void sendMessage() {
        System.out.println("nokia send sms");
    }

    @Override
    public void sendImageMessage() {
        System.out.println("nokia send mms");
    }

    @Override
    public void getMessage() {
        System.out.println("get sms");
    }

    @Override
    public void getImageMessage() {
        System.out.println("get mms");

    }

    @Override
    public void makeVideo() {
        System.out.println("video camera absent");
    }

    @Override
    public void makePhoto() {
        System.out.println("photo camera absent");
    }

}
