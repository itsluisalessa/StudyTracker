package studytracker.service;

import studytracker.model.Student;
import studytracker.model.Subject;

public class StudentService {

    public void addSubject(Student student, Subject subject) {

        String newSubjectName = subject.getName().toUpperCase();

        int subjectSize = student.getSubjects().size();

        for (int i = 0; i < subjectSize; i++) {
            String nameSubject = student.getSubjects().get(i).getName();
            String nameSubjectUC = nameSubject.toUpperCase();

            if (newSubjectName.equals(nameSubjectUC)) {
                return;
            }
        }
        student.addSubject(subject);
    }
}
