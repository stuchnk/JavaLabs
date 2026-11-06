package lr14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File f = new File("f.txt");
        Scanner keyboard = new Scanner(System.in);


        try (PrintWriter out = new PrintWriter(new FileWriter(f))) {
            System.out.println("Введите 10 целых чисел:");
            for (int i = 0; i < 10; i++) {
                out.println(keyboard.nextInt());
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }


        int count = 0;
        System.out.println("Числа из файла:");
        try (Scanner in = new Scanner(f)) {
            while (in.hasNextInt()) {
                int n = in.nextInt();
                System.out.println(n);
                if (n % 2 == 0 || n % 3 == 0) {
                    count++;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
            return;
        }
        System.out.println("Количество чисел, кратных 2 или 3: " + count);
    }
}
