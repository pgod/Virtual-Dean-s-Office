package godziszewski.patryk.VirtualDeansOffice.repository.impl;

import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

import godziszewski.patryk.VirtualDeansOffice.model.Student;
import godziszewski.patryk.VirtualDeansOffice.repository.StudentRepository;

import static godziszewski.patryk.VirtualDeansOffice.model.StudentBuilder.createStudent;

/**
 * Created by Patryk on 2016-12-20.
 */
@Repository
public class InMemoryStudentRepositoryImpl implements StudentRepository {
    private Set<Student> students;

    public InMemoryStudentRepositoryImpl() {
        this.students = new HashSet<>();

        Student s1 =
                createStudent()
                .withName("Jan")
                .withSurname("Kowalski")
                .withUsername("user")
                .withPassword("password")
                .build();
        Student s2 =
                createStudent()
                .withName("Anna")
                .withSurname("Nowak")
                .withUsername("annNow")
                .withPassword("password")
                .build();
        students.add(s1);
        students.add(s2);

    }

    @Override
    public Student getStudentByUsername(String username) {
        for(Student student : students) {
            if(student.getUsername().equals(username)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Set<Student> getAllStudents() {
        return students;
    }

    @Override
    public Set<Student> getStudentsByMajor(String major) {
        Set<Student> studentsByMajor = new HashSet<>();
        for(Student student : students) {
            for(String studentMajor : student.getMajors()) {
                if(studentMajor.equals(major))
                {
                    studentsByMajor.add(student);
                }
            }
        }
        return studentsByMajor;
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }
}
