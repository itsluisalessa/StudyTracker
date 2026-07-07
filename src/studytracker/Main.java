package studytracker;

import studytracker.model.Student;
import studytracker.model.Subject;
import studytracker.model.StudySession;

public class Main {
    public static void main(String[] args) {

        Student luisa = new Student(
                "Luísa"
        );

        Subject java = new Subject(
                "Java",
                0,
                "Easy"
        );

        Subject sql = new Subject(
                "sql",
                30,
                "Easy"
        );

        StudySession session1 = new StudySession(
                java,
                60,
                "2026-07-04"
        );

        java.addStudyTime(session1.getDurationMinutes());

        luisa.addSubject(java);
        luisa.addSubject(sql);

        System.out.println("Subject: " + java.getName());
        System.out.println("Total minutes studied: " + java.getTotalMinutesStudied());
        System.out.println("Luísa's subjects: "+ luisa.getSubjects());
    }
}