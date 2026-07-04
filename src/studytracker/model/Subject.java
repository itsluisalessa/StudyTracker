package studytracker.model;

public class Subject {
    private String name;
    private int totalMinutesStudied;
    private String difficulty;

    public Subject(String name, int totalMinutesStudied,String difficulty) {
        this.name = name;
        this.totalMinutesStudied = totalMinutesStudied;
        this.difficulty = difficulty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalMinutesStudied(int totalMinutesStudied) {
        this.totalMinutesStudied = totalMinutesStudied;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getName() {
        return name;
    }

    public int getTotalMinutesStudied() {
        return totalMinutesStudied;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void addStudyTime(int minutes) {
        if (minutes > 0) {
            this.totalMinutesStudied += minutes;
        }
    }
}

