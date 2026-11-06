package lr14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Locale locale = Locale.forLanguageTag("ru-RU");

        File f = new File("radiation.txt");
        Scanner keyboard = new Scanner(System.in);
        keyboard.useLocale(locale);

        try (PrintWriter out = new PrintWriter(new FileWriter(f))) {
            System.out.println("введите 5 значений через запятую, например 1,2:");

            for (int i = 0; i < 5; i++) {
                double number = keyboard.nextDouble();
                out.printf(locale, "%.1f%n", number);
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }


        double sum = 0;
        int count = 0;

        try (Scanner in = new Scanner(f)) {
            in.useLocale(locale);

            System.out.println("Числа из файла:");

            while (in.hasNextDouble()) {
                double number = in.nextDouble();

                System.out.printf(locale, "%.1f%n", number);

                sum += number;
                count++;
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
            return;
        }

        if (count > 0) {
            System.out.printf(locale,
                    "Средний уровень радиации: %.1f%n", sum / count);
        }
    }
}