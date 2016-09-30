package structural.adapter.gadget.smartphone;

public class XiomiRedmi implements ISmartPhone {

    @Override
    public void call() {
        System.out.println("call");
    }

    @Override
    public void videoCall() {
        System.out.println("video  call");
    }

    @Override
    public void sendMessage() {
        System.out.println("send  message");
    }

    @Override
    public void sendImageMessage() {
        System.out.println("send image message");
    }

    @Override
    public void getMessage() {
        System.out.println("get  message");

    }

    @Override
    public void getImageMessage() {
        System.out.println("get image message");
    }

    @Override
    public void makeVideo() {
        System.out.println("make video");
    }

    @Override
    public void makePhoto() {
        System.out.println("make photo");
    }

    @Override
    public void surfInternet() {
        System.out.println("if internet available surf");
    }

}
