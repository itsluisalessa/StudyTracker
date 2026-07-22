package studytracker.service;

import studytracker.model.Student;
import studytracker.model.StudySession;
import studytracker.model.Subject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

    public boolean deleteSubject(Student student, String subjectName) {

        Subject subject = findSubjectByName(student, subjectName);

        if (subject == null) {
            return false;
        }

        student.removeSubject(subject);

        return true;
    }

    public boolean registerSession(Student student, String subjectName, StudySession studySession) {

        Subject subject = findSubjectByName(student, subjectName);

        if (subject == null) {
            return false;
        }

        subject.addStudySession(studySession);

        return true;

    }

    public List<Subject> getSortedSubjects(Student student) {

        List<Subject> subjects = new ArrayList<>(student.getSubjects());

        Collections.sort(subjects, new Comparator<Subject>() {
            @Override
            public int compare(Subject first, Subject second) {
                return second.getTotalMinutesStudied() - first.getTotalMinutesStudied();
            }
        });

        return subjects;
    }
}
