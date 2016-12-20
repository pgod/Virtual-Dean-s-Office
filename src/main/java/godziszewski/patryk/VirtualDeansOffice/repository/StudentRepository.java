package godziszewski.patryk.VirtualDeansOffice.repository;

import java.util.Set;

import godziszewski.patryk.VirtualDeansOffice.model.Student;

/**
 * Created by Patryk on 2016-12-20.
 */
public interface StudentRepository {
    Student getStudentByUsername(String username);
    Set<Student> getAllStudents();
    Set<Student> getStudentsByMajor(String major);
    void addStudent(Student student);
}
