package studytracker.model;

public class StudySession {
    private int durationMinutes;
    private String date;
    private int questionsAnswered;
    private int correctAnswers;

    public StudySession(int durationMinutes, String date, int questionsAnswered, int correctAnswers) {
        this.durationMinutes = durationMinutes;
        this.date = date;
        this.questionsAnswered = questionsAnswered;
        this.correctAnswers = correctAnswers;
    }

    @Override
    public String toString() {
        return "Duration minutes: "+ durationMinutes +
                " | Date: "+ date +
                " | Question Answered: "+ questionsAnswered +
                " | Correct Answers: "+ correctAnswers;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public String getDate() {
        return date;
    }

    public int getQuestionsAnswered() {
        return questionsAnswered;
    }

    public int getCorrectAnswers() {
        return correctAnswers;
    }
}
