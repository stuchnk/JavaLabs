package lr8;

public class Main {
    public static void main(String[] args) {
        Plate p1 = new Plate("Обеденная тарелка", 0.5, "белый", 25);
        Plate p2 = new Plate("Суповая тарелка", 0.4, "синий", 22);
        Plate p3 = new Plate("Десертная тарелка", 0.2, "розовый", 18);
        Cup c1 = new Cup("Кружка", 0.3, "красный", true);
        Cup c2 = new Cup("Чашка", 0.2, "черный", false);

        Dishware[] items = new Dishware[5];
        items[0] = p1;
        items[1] = p2;
        items[2] = p3;
        items[3] = c1;
        items[4] = c2;

        for (int i = 0; i < items.length; i++) {
            items[i].displayInfo();
            items[i].use();
        }

        System.out.println("Уникальные методы:");
        p1.stack();
        p2.stack();
        p3.stack();
        c1.fill();
        c2.fill();
    }
}
