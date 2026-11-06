package Lr10;

public class Editor implements Installable, Updatable {
    private String name;
    private String version;
    private String format;
    private boolean installed;

    public Editor(String name, String version, String format) {
        this.name = name;
        this.version = version;
        this.format = format;
        this.installed = false;
    }

    @Override
    public void install() {
        installed = true;
        System.out.println("редактор " + name + " (формат " + format + ") установлен");
    }

    @Override
    public void uninstall() {
        installed = false;
        System.out.println("редактор " + name + " удалён");
    }

    @Override
    public void update() {
        if (installed) {
            version = version + ".1";
            System.out.println("педактор " + name + " обновлён до версии " + version);
        } else {
            System.out.println("редактор " + name + " не установлен, обновление невозможно");
        }
    }

    @Override
    public String getVersion() {
        return version;
    }

    public String getName() { return name; }
    public String getFormat() { return format; }
}
