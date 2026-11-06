package lr14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("plant.txt");


        try (PrintWriter out = new PrintWriter(new FileWriter(file, StandardCharsets.UTF_8))) {
            out.println("Любимое растение: роза");
            out.println("Семейство: Розоцветные");
            out.println("Цвет цветков: красный, белый, розовый");
            out.println("Цветёт с июня по сентябрь");
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }

        System.out.println("Имя файла: " + file.getName());
        System.out.println("Размер: " + file.length() + " байт");
        System.out.println("Путь: " + file.getPath());
        System.out.println("Абсолютный путь: " + file.getAbsolutePath());
        System.out.println("Родительский каталог: " + file.getParent());
        System.out.println("Файл существует: " + file.exists());
        System.out.println("Чтение разрешено: " + file.canRead());
        System.out.println("Запись разрешена: " + file.canWrite());
        System.out.println("Это каталог: " + file.isDirectory());
        System.out.println("Последнее изменение: " + file.lastModified());



        try (BufferedReader in = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8))) {
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }
}