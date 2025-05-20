public class Piano implements Playable {
    private int numberOfKeys;
    private String type; // e.g., Grand, Upright

    public Piano(int numberOfKeys, String type) {
        this.numberOfKeys = numberOfKeys;
        this.type = type;
    }

    @Override
    public void playNote(String note) {
        System.out.println("Playing the " + note + " note on the " + type + " piano.");
    }

    @Override
    public void tune() {
        System.out.println("A professional is tuning the " + numberOfKeys + "-key piano.");
    }
}
