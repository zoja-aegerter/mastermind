public enum Color {
    RED('r'),
    GREEN('g'),
    BLUE('b'),
    YELLOW('y'),
    WHITE('w'),
    BLACK('s');

    private final char code;

    Color(char code) {
        this.code = code;
    }

    public static String colorList() {
        StringBuilder colorCodes = new StringBuilder();
        for (Color color: values()) {
            colorCodes.append(color.code).append(", ");
        }
        String codes = colorCodes.toString();
        codes = codes.substring(0, codes.length() - 2);
        return codes;
    }

    public static Color getColor(char colorCode) {
        for (Color color: values()) {
            if(color.code == colorCode)
                return color;
        }
        return null;
    }
}
