package studytracker.model;

public class StudySession {
    private int durationMinutes;
    private String date;

    public StudySession(int durationMinutes, String date) {
        this.durationMinutes = durationMinutes;
        this.date = date;
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
}
