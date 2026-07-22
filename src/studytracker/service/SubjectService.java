package studytracker.service;

import studytracker.model.Subject;

public class SubjectService {

    public Subject createSubject(String name, int totalMinutesStudied, String difficulty, int questionsAnswered, int correctAnswers) {
        return new Subject(name, totalMinutesStudied, difficulty, questionsAnswered, correctAnswers);
    }
}
