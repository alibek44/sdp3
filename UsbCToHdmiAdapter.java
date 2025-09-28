public final class UsbCToHdmiAdapter implements HdmiDisplay {
    private final UsbCDisplayDevice usbC;

    public UsbCToHdmiAdapter(UsbCDisplayDevice usbC) {
        if (usbC == null) throw new IllegalArgumentException("usbC device is required");
        this.usbC = usbC;
    }

    @Override
    public void showFrame(Frame frame) {
        if (frame == null) return;
        byte[] bytes = frame.encode();
        usbC.transferVideo(bytes);
    }
}
