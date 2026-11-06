package Lr7;

public class Main {
    public static void main(String[] args) {
        Phone p1 = new Phone("Samsung", 800, 4500);
        Phone p2 = new Phone("Apple", 1200, 4000);
        Phone p3 = new Phone("Xiaomi", 500, 5000);
        Phone p4 = new Phone("Huawei", 700, 4200);
        Phone p5 = new Phone("Nokia", 300, 3800);
        Phone p6 = new Phone("Google", 900, 4600);

        System.out.println("Средняя цена телефонов: " + Phone.getAveragePrice());
    }
}
