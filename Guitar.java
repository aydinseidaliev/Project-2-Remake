public class Guitar implements Playable{
    private int numberOfStrings;
    private String brand;

    public Guitar(int numberOfStrings, String brand) {
        this.numberOfStrings = numberOfStrings;
        this.brand = brand;
    }

    @Override
    public void playNote(String note) {
        System.out.println("Strumming the " + note + " note on the " + brand + " guitar.");
    }

    @Override
    public void tune() {
        System.out.println("Tuning all " + numberOfStrings + " strings of the guitar.");
    }
}
