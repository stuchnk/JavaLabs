package Lr7;

public class Phone {

    private String brand;
    private double price;
    private int battery;


    private static int totalPhones = 0;
    private static double totalPrice = 0;




    public Phone(String brand, double price, int battery) {
        this.brand = brand;
        this.price = price;
        this.battery = battery;
        totalPhones++;
        totalPrice += price;
    }


    public static double getAveragePrice() {
        if (totalPhones == 0) {
            return 0;
        }
        return totalPrice / totalPhones;
    }

    public  String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getBattery() {
        return battery;
    }

    public static void printInfo(){

         System.out.println(totalPhones);
         System.out.println(totalPrice);
    }
    //Phone.printInfo();
}
