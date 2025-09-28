public final class HdmiMonitor implements HdmiDisplay {
    private final String model;

    public HdmiMonitor(String model) {
        this.model = model;
    }

    @Override
    public void showFrame(Frame frame) {
        System.out.printf("[HDMI %s] Showing: %s%n", model, frame.contents());
    }
}
