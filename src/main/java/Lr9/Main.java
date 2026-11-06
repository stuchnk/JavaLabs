package Lr9;

public class Main {
    public static void main(String[] args) {


        Sportsman[] players = new Sportsman[5];
        players[0] = new Forward("Иванов", "Зенит", 9, 12);
        players[1] = new Forward("Петров", "Зенит", 11, 8);
        players[2] = new Defender("Сидоров", "Зенит", 4, 25);
        players[3] = new Defender("Кузнецов", "Зенит", 5, 30);
        players[4] = new Defender("Смирнов", "Зенит", 3, 18);

        for (int i = 0; i < players.length; i++) {
            players[i].displayInfo();
            System.out.println("Позиция: " + players[i].getPosition());
            System.out.println("Статистика: " + players[i].getStatistics());
            System.out.println("Карточка: " + players[i].getFullTitle());
        }

        players[0].changeTeam("Спартак");
        System.out.println(players[0].getFullTitle());
    }
}
