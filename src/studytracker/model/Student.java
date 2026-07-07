package studytracker.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Subject> subjects;

    public Student(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Name: "+ name + " | Subjects: "+ subjects;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void addSubject(Subject subject) {
        this.subjects.add(subject);
    }
}

