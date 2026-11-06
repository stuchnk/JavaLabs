package Lr3;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String text = scanner.nextLine();


        char[] chars = text.toCharArray();


        System.out.println("Символы через пробел:");
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
