package Lr11;

public class Guitar extends Instrument {
    private int strings;

    public Guitar(String name, String type, String sound, int strings) {
        super(name, type, sound);
        this.strings = strings;
    }

    public int getStrings() { return strings; }

    @Override
    public String getSoundType() {
        return "Струнный звук";
    }


    public String tune() {
        return "настраиваю гитару";
    }

    public String tune(int string) {
        return "настраиваю струну номер " + string;
    }
}
