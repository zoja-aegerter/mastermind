import java.util.Random;

public class CodeGenerator {
    private static final Random random = new Random();

    public static Code generate() {
        Pin[] pins = new Pin[Code.LENGTH];
        for (int i = 0; i < Code.LENGTH; i++ ) {
            pins[i] = randomPin();
        }
        return new Code(pins);
    }

    private static Pin randomPin() {
        int number = random.nextInt(Color.values().length);
        return new Pin(Color.values()[number]);
    }
}
