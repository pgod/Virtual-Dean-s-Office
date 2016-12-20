package godziszewski.patryk.VirtualDeansOffice.model;

import java.util.List;

/**
 * Created by Patryk on 2016-12-18.
 */
public class Teacher extends Person {
    List<String> subjects;

    // TODO
    Teacher(String name, String surname, String username, String password) {
        super(name, surname, username, password);
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
}
