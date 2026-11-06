package Lr10;

public class Main {
    public static void main(String[] args) {
        Installable.showInfo();

        Game g1 = new Game("Dota", "1.0", "MOBA");
        Game g2 = new Game("Minecraft", "2.0", "Песочница");
        Game g3 = new Game("Chess", "1.5", "Настольная");
        Editor e1 = new Editor("Notepad", "3.0", "txt");
        Editor e2 = new Editor("Word", "4.0", "docx");

        Installable[] programs = {g1, g2, g3, e1, e2};
        Updatable[] updates = {g1, g2, g3, e1, e2};

        for (int i = 0; i < programs.length; i++) {
            programs[i].install();
            updates[i].update();
            System.out.println("Версия: " + updates[i].getVersion());

        }

        programs[0].uninstall();
    }
}
