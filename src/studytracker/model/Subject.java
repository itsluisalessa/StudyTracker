package studytracker.model;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private String name;
    private int totalMinutesStudied;
    private String difficulty;
    private List<StudySession> studySessions;
    private int questionsAnswered;
    private int correctAnswers;

    public Subject(String name, int totalMinutesStudied,String difficulty, int questionsAnswered, int correctAnswers) {
        this.name = name;
        this.totalMinutesStudied = totalMinutesStudied;
        this.difficulty = difficulty;
        this.studySessions = new ArrayList<>();
        this.questionsAnswered = questionsAnswered;
        this.correctAnswers = correctAnswers;
    }

    @Override
    public String toString() {
        return "Name: "+ name +
                " | Total minutes Studied: "+ totalMinutesStudied +
                " | Difficulty: "+ difficulty +
                " | Study sessions: "+ studySessions +
                " | Questions Answered: "+ questionsAnswered +
                " | Correct Answers: "+ correctAnswers;
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

    public int getQuestionsAnswered() {
        return questionsAnswered;
    }

    public int getCorrectAnswers() {
        return correctAnswers;
    }

    private void addStudyTime(int minutes) {
        if (minutes > 0) {
            this.totalMinutesStudied += minutes;
        }
    }

    public boolean addStudySession(StudySession session) {

        if (!isExerciseResultValid(session.getQuestionsAnswered(), session.getCorrectAnswers())) {
            return false;
        }

        this.studySessions.add(session);
        this.addStudyTime(session.getDurationMinutes());

        this.questionsAnswered += session.getQuestionsAnswered();
        this.correctAnswers += session.getCorrectAnswers();

        return true;
    }

    public String getFormattedStudyTime() {

        int hours = totalMinutesStudied / 60;
        int minutes = totalMinutesStudied % 60;

        if (minutes < 10) {
            return hours + "h 0" + minutes + "min";
        }
        return hours + "h " + minutes + "min";
    }

    private boolean isExerciseResultValid(int questionsAnswered, int correctAnswers) {
        if (questionsAnswered < 0) {
            return false;
        }

        if (correctAnswers < 0) {
            return false;
        }

        return correctAnswers <= questionsAnswered;
    }

    public double getAccuracyPercentage() {

        if (questionsAnswered == 0) {
            return 0;
        }

        return (correctAnswers * 100.0) / questionsAnswered;
    }
}
