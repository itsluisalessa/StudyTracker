package studytracker.model;

public class StudySession {
    private int id;
    private Subject subject;
    private int durationMinutes;
    private String date;

    public StudySession(int id, Subject subject, int durationMinutes, String date) {
        this.id = id;
        this.subject = subject;
        this.durationMinutes = durationMinutes;
        this.date = date;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getId() {
        return id;
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
