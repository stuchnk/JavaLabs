package Lr10;

public class Game implements Installable, Updatable {
    private String name;
    private String version;
    private String genre;
    private boolean installed;

    public Game(String name, String version, String genre) {
        this.name = name;
        this.version = version;
        this.genre = genre;
        this.installed = false;
    }

    @Override
    public void install() {
        installed = true;
        System.out.println("игра " + name + " (" + genre + ") установлена");
    }

    @Override
    public void uninstall() {
        installed = false;
        System.out.println("игра " + name + " удалена");
    }

    @Override
    public void update() {
        if (installed) {
            version = version + ".1";
            System.out.println("игра " + name + " обновлена до версии " + version);
        } else {
            System.out.println("игра " + name + " не установлена, обновление невозможно");
        }
    }

    @Override
    public String getVersion() {
        return version;
    }

    public String getName() { return name; }
    public String getGenre() { return genre; }
}
