package at.htl.football;

public class Team {

    private String name;
    private int points;
    private int wins;
    private int draws;
    private int defeats;
    private int goalsShot;
    private int goalsRecieved;

    public Team(String name) {
        this.name = name;
    }

    public void addMatch(Match match) {

    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public int getWins() {
        return wins;
    }

    public int getDraws() {
        return draws;
    }

    public int getDefeats() {
        return defeats;
    }

    public int getGoalsShot() {
        return goalsShot;
    }

    public int getGoalsRecieved() {
        return goalsRecieved;
    }
}
