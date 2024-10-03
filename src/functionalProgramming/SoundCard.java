package functionalProgramming;

public class SoundCard {
    private USB usb;

    public SoundCard(USB usb) {
        this.usb = usb;
    }

    public USB getUsb() {
        return usb;
    }
}
