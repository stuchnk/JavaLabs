package lr14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        File f = new File("f.txt");
        File g = new File("g.txt");
        File h = new File("h.txt");
        Random random = new Random();


        try (PrintWriter out = new PrintWriter(new FileWriter(f))) {
            for (int i = 0; i < 100; i++) {
                out.println(random.nextInt(1000) + 1);
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи f: " + e.getMessage());
            return;
        }


        try (BufferedReader in = new BufferedReader(new FileReader(f));
             PrintWriter outG = new PrintWriter(new FileWriter(g));
             PrintWriter outH = new PrintWriter(new FileWriter(h))) {
            String line;
            while ((line = in.readLine()) != null) {
                int n = Integer.parseInt(line.trim());
                if (n % 5 == 0 && n % 7 == 0) {
                    outG.println(n);
                } else {
                    outH.println(n);
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка обработки файлов: " + e.getMessage());
            return;
        }
        System.out.println("числа кратные 5 и 7 в g.txt, остальные в h.txt");
    }
}
