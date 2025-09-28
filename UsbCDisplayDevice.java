import java.nio.charset.StandardCharsets;

public final class UsbCDisplayDevice {
    private final String model;

    public UsbCDisplayDevice(String model) {
        this.model = model;
    }

    public void transferVideo(byte[] rawData) {
        String decoded = new String(rawData, StandardCharsets.UTF_8);
        System.out.printf("[USB-C %s] Rendering (via Alt Mode): %s%n", model, decoded);
    }
}
