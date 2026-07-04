package studytracker;

import studytracker.model.Subject;
import studytracker.model.StudySession;

public class Main {
    public static void main(String[] args) {

        Subject java = new Subject(
                "Java",
                0,
                "Easy"
        );

        StudySession session1 = new StudySession(
                java,
                60,
                "2026-07-04"
        );

        java.addStudyTime(session1.getDurationMinutes());

        System.out.println("Subject: " + java.getName());
        System.out.println("Total minutes studied: " + java.getTotalMinutesStudied());
    }
}