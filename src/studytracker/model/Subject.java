package studytracker.model;

public class Subject {
    private int id;
    private String name;
    private int totalHoursStudied;
    private String difficulty;

    public Subject(int id, String name, int totalHoursStudied,String difficulty) {
        this.id = id;
        this.name = name;
        this.totalHoursStudied = totalHoursStudied;
        this.difficulty = difficulty;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getId() {
        return id;
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

