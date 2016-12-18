package godziszewski.patryk.VirtualDeansOffice.model;

import java.time.LocalDate;

/**
 * Created by Patryk on 2016-12-18.
 */
public class Grade {
    private String subject;
    private String typeOfSubject;
    private double mark;
    private LocalDate dateOfEntry;
    private byte termNumber;
    private Teacher teacher;
    private String typeOfExamination;
    private byte semester;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTypeOfSubject() {
        return typeOfSubject;
    }

    public void setTypeOfSubject(String typeOfSubject) {
        this.typeOfSubject = typeOfSubject;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public LocalDate getDateOfEntry() {
        return dateOfEntry;
    }

    public void setDateOfEntry(LocalDate dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
    }

    public byte getTermNumber() {
        return termNumber;
    }

    public void setTermNumber(byte termNumber) {
        this.termNumber = termNumber;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getTypeOfExamination() {
        return typeOfExamination;
    }

    public void setTypeOfExamination(String typeOfExamination) {
        this.typeOfExamination = typeOfExamination;
    }

    public byte getSemester() {
        return semester;
    }

    public void setSemester(byte semester) {
        this.semester = semester;
    }
}
