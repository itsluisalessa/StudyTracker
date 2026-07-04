package studytracker.model;

public class StudySession {
    private Subject subject;
    private int durationMinutes;
    private String date;

    public StudySession(Subject subject, int durationMinutes, String date) {
        this.subject = subject;
        this.durationMinutes = durationMinutes;
        this.date = date;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public Subject getSubject() {
        return subject;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public String getDate() {
        return date;
    }
}
