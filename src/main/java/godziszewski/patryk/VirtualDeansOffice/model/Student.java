package godziszewski.patryk.VirtualDeansOffice.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Patryk on 2016-12-18.
 */
public class Student extends Person {
    private String albumNumber;
    List<Grade> grades;
    private boolean isGraduate;
    private List<String> majors;

    Student(StudentBuilder studentBuilder) {
        super(
                studentBuilder.name,
                studentBuilder.surname,
                studentBuilder.username,
                studentBuilder.password
        );
        this.majors = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public String getAlbumNumber() {
        return albumNumber;
    }

    public void setAlbumNumber(String albumNumber) {
        this.albumNumber = albumNumber;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    public boolean isGraduate() {
        return isGraduate;
    }

    public void setGraduate(boolean graduate) {
        isGraduate = graduate;
    }

    public List<String> getMajors() {
        return majors;
    }

    public void setMajors(List<String> majors) {
        this.majors = majors;
    }
}
