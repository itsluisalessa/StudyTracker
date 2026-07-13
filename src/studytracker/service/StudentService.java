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

    public Subject findSubjectByName(Student student, String subjectName) {

        List<Subject> studentSubjects = student.getSubjects();

        for (Subject subject : studentSubjects) {

            if (subjectName.equalsIgnoreCase(subject.getName())) {
                return subject;
            }
        }
        return null;
    }

    public boolean updateDifficulty(Student student, String subjectName, String newDifficulty) {

        Subject subject = findSubjectByName(student, subjectName);

        if (subject == null) {
            return false;
        }

        subject.setDifficulty(newDifficulty);

        return true;
    }

    public List<Subject> listSubjects(Student student) {
        return student.getSubjects();
    }
}
