package Lr9;

public abstract class Sportsman {
    private String name;
    private String team;
    private int number;

    public Sportsman(String name, String team, int number) {
        this.name = name;
        this.team = team;
        this.number = number;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getTeam() { return team; }
    public void setTeam(String team) { this.team = team; }

    public int getNumber() { return number; }
    public void setNumber(int number) { this.number = number; }

    public abstract String getPosition();
    public abstract String getStatistics();


    public String getFullTitle() {
        return name + " (N" + number + ", " + team + ")";
    }

    public void changeTeam(String newTeam) {
        System.out.println(name + " переходит из " + team + " в " + newTeam);
        this.team = newTeam;
    }

    public void displayInfo() {
        System.out.println("Имя: " + name + ", команда: " + team + ", номер: " + number);
    }
}
