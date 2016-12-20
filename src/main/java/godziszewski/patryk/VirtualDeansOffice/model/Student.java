package godziszewski.patryk.VirtualDeansOffice.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Patryk on 2016-12-18.
 */
public class Student extends Person {
    private String albumNumber;
    private Set<Grade> grades;
    private boolean isGraduate;
    private Set<String> majors;

    Student(StudentBuilder studentBuilder) {
        super(
                studentBuilder.name,
                studentBuilder.surname,
                studentBuilder.username,
                studentBuilder.password
        );
        this.majors = new HashSet<>();
        this.grades = new HashSet<>();
    }

    public String getAlbumNumber() {
        return albumNumber;
    }

    public void setAlbumNumber(String albumNumber) {
        this.albumNumber = albumNumber;
    }

    public Set<Grade> getGrades() {
        return grades;
    }

    public void setGrades(Set<Grade> grades) {
        this.grades = grades;
    }

    public boolean isGraduate() {
        return isGraduate;
    }

    public void setGraduate(boolean graduate) {
        isGraduate = graduate;
    }

    public Set<String> getMajors() {
        return majors;
    }

    public void setMajors(Set<String> majors) {
        this.majors = majors;
    }
}
