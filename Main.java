public class Main {
    public static void main(String[] args) {
        Guitar myGuitar = new Guitar(6, "Fender");
        Piano myPiano = new Piano(88, "Grand");

        myGuitar.playNote("E");
        myGuitar.tune();

        myPiano.playNote("C");
        myPiano.tune();
    }
}
