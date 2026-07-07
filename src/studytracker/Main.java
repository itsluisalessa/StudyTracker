package studytracker;

import studytracker.model.Student;
import studytracker.model.Subject;
import studytracker.model.StudySession;
import studytracker.service.StudentService;
import studytracker.service.StudySessionService;
import studytracker.service.SubjectService;

public class Main {
    public static void main(String[] args) {

        Student luisa = new Student(
                "Luísa"
        );

        SubjectService subjectService = new SubjectService();

        Subject java = subjectService.createSubject(
                "Java",
                0,
                "Easy"
        );

        StudySession session = new StudySession(
                60,
                "2026-07-04"
        );

        StudySessionService studySessionService = new StudySessionService();

        studySessionService.registerSession(java, session);

        StudentService studentService = new StudentService();

        studentService.addSubject(luisa, java);

        System.out.println(java);
        System.out.println(luisa);
    }
}