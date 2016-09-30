package structural.adapter.gadget.service;

import structural.adapter.gadget.smartphone.ISmartPhone;

public class GadgetManager {
    ISmartPhone gadget;

    public GadgetManager(ISmartPhone gadget) {
        super();
        this.gadget = gadget;
    }

    public void setGadget(ISmartPhone gadget) {
        this.gadget = gadget;
    }

    public void call(boolean isVideo) {
        if (isVideo) {
            gadget.videoCall();
        } else {
            gadget.call();
        }
    }

    public void sendMessage(boolean isImage) {
        if (isImage) {
            gadget.sendImageMessage();
        } else {
            gadget.sendMessage();
        }
    }

    public void surfInternet() {
       gadget.surfInternet();
    }
}
