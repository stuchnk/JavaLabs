package Lr12;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main1 {
    public static void main(String[] args) {
        
        Map<String, Dish> dishes = new LinkedHashMap<String, Dish>();

        dishes.put("Обеденная тарелка", new Plate("Обеденная тарелка", 1, 0.5, 25));
        dishes.put("Суповая тарелка", new Plate("Суповая тарелка", 2, 0.4, 22));
        dishes.put("Десертная тарелка", new Plate("Десертная тарелка", 3, 0.2, 18));

        dishes.put("Кружка", new Cup("Кружка", 4, 0.3, true));
        dishes.put("Стакан", new Cup("Стакан", 5, 0.25, false));
        dishes.put("Чашка", new Cup("Чашка", 6, 0.2, true));

        dishes.put("Салатник", new Bowl("Салатник", 7, 1.0, 10));
        dishes.put("Пиала", new Bowl("Пиала", 8, 0.3, 6));

        for (String key : dishes.keySet()) {
            System.out.println("Ключ: " + key + " -> Значение: " + dishes.get(key));
        }
    }
}
