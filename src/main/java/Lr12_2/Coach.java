package Lr12_2;

import java.util.List;

public class Coach {
    private int id;
    private String name;
    private String sport;
    private int level;
    private List<Integer> athleteRatings;

    public Coach(int id, String name, String sport, int level, List<Integer> athleteRatings) {
        this.id = id;
        this.name = name;
        this.sport = sport;
        this.level = level;
        this.athleteRatings = athleteRatings;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getSport() { return sport; }

    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }

    public double getAverageRating() {
        if (athleteRatings.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int rating : athleteRatings) {
            sum += rating;
        }
        return (double) sum / athleteRatings.size();
    }

    @Override
    public String toString() {
        return "Coach{id=" + id + ", name=" + name + ", sport=" + sport + ", level=" + level
                + ", avg=" + String.format("%.2f", getAverageRating()) + "}";
    }
}
