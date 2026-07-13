package studytracker.service;

import studytracker.model.Student;
import studytracker.model.Subject;

import java.util.List;

public class StudentService {

    public void addSubject(Student student, Subject subject) {

        List<Subject> studentSubjects = student.getSubjects();

        for (Subject existingSubject : studentSubjects) {

            if (existingSubject.getName().equalsIgnoreCase(subject.getName())) {
                return;
            }
        }
        student.addSubject(subject);
    }
}
