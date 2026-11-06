package Lr10;

public interface Installable {
    void install();
    void uninstall();

    static void showInfo() {
        System.out.println("Интерфейс Installable установка и удаление ПО");
    }
}
