public final class Laptop {
    private final HdmiDisplay externalDisplay;

    public Laptop(HdmiDisplay externalDisplay) {
        if (externalDisplay == null) throw new IllegalArgumentException("display is required");
        this.externalDisplay = externalDisplay;
    }

    public void present(String slideText) {
        externalDisplay.showFrame(new Frame(slideText));
    }
}
