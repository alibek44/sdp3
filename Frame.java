import java.nio.charset.StandardCharsets;

public final class Frame {
    private final String contents;

    public Frame(String contents) {
        this.contents = contents;
    }

    public String contents() {
        return contents;
    }

    public byte[] encode() {
        return contents.getBytes(StandardCharsets.UTF_8);
    }
}
