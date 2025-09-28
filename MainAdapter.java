public class MainAdapter {
    public static void main(String[] args) {
        HdmiDisplay hdmiMonitor = new HdmiMonitor("Dell U2419H");
        Laptop officeLaptop = new Laptop(hdmiMonitor);
        officeLaptop.present("Slide 1: Quarterly Results");

        System.out.println();

        UsbCDisplayDevice usbCPanel = new UsbCDisplayDevice("LG UltraFine USB-C");
        HdmiDisplay adaptedUsbC = new UsbCToHdmiAdapter(usbCPanel);
        Laptop travelLaptop = new Laptop(adaptedUsbC);
        travelLaptop.present("Slide 2: Roadmap & Milestones");
    }
}
