package Lr10;

public interface Updatable {
    void update();
    String getVersion();

    int hug = 3902;

    default void showInfo(){System.out.println("оврисрои");}
    static void printInfo(){System.out.println("hbehb");}
}
