package studytracker.service;

import studytracker.model.Student;
import studytracker.model.Subject;

public class StudentService {

    public void addSubject(Student student, Subject subject) {
        student.addSubject(subject);
    }
}
