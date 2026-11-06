package Lr11;

public class Piano extends Instrument {
    private int keys;
    public int getKeys() { return keys; }
    public Piano(String name, String type, String sound, int keys) {
        super(name, type, sound);
        this.keys = keys;
    }


    @Override
    public String getSoundType() {
        return "Клавишный звук";
    }


    public String playChord() {
        return "Играю аккорд";
    }

    public String playChord(String chord) {
        return "Играю аккорд " + chord;
    }
}
