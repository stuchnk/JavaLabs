package Lr2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Введите " + n + " элементов массива:");


        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Введите число для поиска: ");
        int number = scanner.nextInt();

        int count = 0;


        for (int i = 0; i < n; i++) {
            if (array[i] == number) {
                count++;
            }
        }

        System.out.println("Число " + number + " встречается в массиве " + count + " раз");

        scanner.close();
    }
}
