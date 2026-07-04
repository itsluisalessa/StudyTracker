package studytracker.model;

public class Subject {
    private String name;
    private int totalHoursStudied;
    private String difficulty;

    public Subject(String name, int totalHoursStudied,String difficulty) {
        this.name = name;
        this.totalHoursStudied = totalHoursStudied;
        this.difficulty = difficulty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalHoursStudied(int totalHoursStudied) {
        this.totalHoursStudied = totalHoursStudied;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getName() {
        return name;
    }

    public int getTotalHoursStudied() {
        return totalHoursStudied;
    }

    public String getDifficulty() {
        return difficulty;
    }
}

