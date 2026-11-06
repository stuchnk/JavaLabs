package Lr11;

public class Instrument {
    private String name;
    private String type;
    private String sound;

    public String getName() { return name; }
    public String getType() { return type; }
    public String getSound() { return sound; }

    public Instrument(String name, String type, String sound) {
        this.name = name;
        this.type = type;
        this.sound = sound;
    }




    public String play() {
        return "играю";
    }

    public String play(int volume) {
        return "играю громкостью " + volume;
    }

    public String play(String melody) {
        return "играю мелодию " + melody;
    }


    public String getSoundType() {
        return "стандартный звук";
    }
}
