public class Mastermind {

    private Code secret;
    public static void main(String[] args) {
//        System.out.println("Geben Sie einen Versuchscode ein mit " + Code.LENGTH + " Buchstaben aus der Menge {" +
//                Color.colorList() + "} ein: ");
//        System.out.println("Spiel beendet. Geheimcode war xxxx. Anzahl Versuche : 6");

        Mastermind game = new Mastermind();
        game.play();
    }

    private void play() {
        secret = CodeGenerator.generate();

    }
}
