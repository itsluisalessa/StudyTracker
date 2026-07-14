package studytracker.model;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private String name;
    private int totalMinutesStudied;
    private String difficulty;
    private List<StudySession> studySessions;

    public Subject(String name, int totalMinutesStudied,String difficulty) {
        this.name = name;
        this.totalMinutesStudied = totalMinutesStudied;
        this.difficulty = difficulty;
        this.studySessions = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Name: "+ name + " | Total minutes Studied: "+ totalMinutesStudied + " | Difficulty: "+ difficulty + " | Study sessions: "+ studySessions;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<StudySession> getStudySessions() {
        return studySessions;
    }

    public void addStudyTime(int minutes) {
        if (minutes > 0) {
            this.totalMinutesStudied += minutes;
        }
    }

    public void addStudySession(StudySession session) {
        this.studySessions.add(session);
        this.addStudyTime(session.getDurationMinutes());
    }

    public String getFormattedStudyTime() {

        int hours = totalMinutesStudied / 60;
        int minutes = totalMinutesStudied % 60;

        if (minutes < 10) {
            return hours + "h 0" + minutes + "min";
        }
        return hours + "h " + minutes + "min";
    }
}
