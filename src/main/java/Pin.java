public class Pin {
    private final Color color;

    public Pin(Color color) {
        this.color = color;
    }

    public Pin(char color) {
        this.color = Color.getColor(color);
    }
}
