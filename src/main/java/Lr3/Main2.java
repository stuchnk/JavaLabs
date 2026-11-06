package Lr3;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите предложение: ");
        String sentence = scanner.nextLine();





        StringBuilder sb = new StringBuilder(sentence);

        sb.reverse();


        System.out.println("Результат: " + sb.toString());

        scanner.close();
    }
}
