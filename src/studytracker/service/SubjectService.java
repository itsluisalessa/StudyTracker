package studytracker.service;

import studytracker.model.Subject;

public class SubjectService {

    public Subject createSubject(String name, int totalMinutesStudied, String difficulty) {
        return new Subject(name, totalMinutesStudied, difficulty);
    }
}
