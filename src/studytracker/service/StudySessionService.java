package studytracker.service;

import studytracker.model.StudySession;
import studytracker.model.Subject;

public class StudySessionService {

    public void registerSession(Subject subject, StudySession studySession) {
        subject.addStudySession(studySession);
    }
}
