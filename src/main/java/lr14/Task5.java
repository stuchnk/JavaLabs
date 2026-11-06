package lr14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        File f = new File("f.txt");
        Random random = new Random();


        try (PrintWriter out = new PrintWriter(new FileWriter(f))) {
            for (int i = 0; i < 10; i++) {
                out.println(random.nextInt(201) - 50); // от -50 до 150
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
                if (n > 75) {
                    count++;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
            return;
        }
        System.out.println("Количество чисел больше 75: " + count);
    }
}
