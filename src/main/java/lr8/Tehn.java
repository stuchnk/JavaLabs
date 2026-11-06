package lr8;

public class Tehn extends Dishware {
    private int age;

    public Tehn(String name, double volume, String color, int age) {
        super(name, volume, color);
        this.age = age;
    }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}