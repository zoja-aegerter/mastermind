public class Code {
    public static final int LENGTH = 4;
    private final Pin[] pins;

    public Code(Pin[] pins) {
        this.pins = pins;
    }
    public Code(String input) {
        pins = new Pin[LENGTH];
        for(int i = 0; i < LENGTH; i++) {
            pins[i] = new Pin(input.charAt(i));
        }
    }
}
