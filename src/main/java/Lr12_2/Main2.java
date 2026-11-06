package Lr12_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2 {

    public static void printCoaches(List<Coach> coaches, int level) {
        for (Coach coach : coaches) {
            if (coach.getLevel() == level) {
                System.out.println(coach);
            }
        }
    }

    public static void main(String[] args) {
        List<Coach> coaches = new ArrayList<Coach>();
        coaches.add(new Coach(1, "Гризлик", "Футбол", 1, Arrays.asList(5, 4, 5)));
        coaches.add(new Coach(2, "Петрик", "Хоккей", 2, Arrays.asList(3, 3, 4)));
        coaches.add(new Coach(3, "Луинек", "Плавание", 1, Arrays.asList(2, 3, 2)));
        coaches.add(new Coach(4, "Зигинов", "Теннис", 2, Arrays.asList(4, 4, 4)));
        coaches.add(new Coach(5, "Коктев", "Бокс", 3, Arrays.asList(4, 4, 4)));

        for (Coach coach : coaches) {
            if (coach.getAverageRating() > 3) {
                System.out.println(coach);
            }
        }

        for (Coach coach : coaches) {
            if (coach.getAverageRating() >= 4) {
                coach.setLevel(coach.getLevel() + 1);
            }
        }

        printCoaches(coaches, 2);

        Collections.sort(coaches, new Comparator<Coach>() {
            @Override
            public int compare(Coach a, Coach b) {
                int result = Double.compare(b.getAverageRating(), a.getAverageRating());
                if (result != 0) {
                    return result;
                }

                return b.getName().compareTo(a.getName());
            }
        });

        for (Coach coach : coaches) {
            System.out.println("ID: " + coach.getId() + ", имя: " + coach.getName()
                    + ", средний рейтинг: " + String.format("%.2f", coach.getAverageRating()));
        }
    }
}