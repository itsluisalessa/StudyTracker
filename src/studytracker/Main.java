package studytracker;

import studytracker.model.Student;
import studytracker.model.Subject;
import studytracker.model.StudySession;
import studytracker.service.StudentService;
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
                "Easy",
                0,
                0
        );

        StudySession session = new StudySession(
                60,
                "2026-07-04",
                0,
                0
        );

        StudentService studentService = new StudentService();

        studentService.addSubject(luisa, java);

        System.out.println(java);
        System.out.println(luisa);
    }
}