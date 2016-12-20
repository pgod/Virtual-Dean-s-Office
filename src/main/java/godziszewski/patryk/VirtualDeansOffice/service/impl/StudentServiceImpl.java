package godziszewski.patryk.VirtualDeansOffice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

import godziszewski.patryk.VirtualDeansOffice.model.Student;
import godziszewski.patryk.VirtualDeansOffice.repository.StudentRepository;
import godziszewski.patryk.VirtualDeansOffice.service.StudentService;

/**
 * Created by Patryk on 2016-12-20.
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student getStudentByUsername(String username) {
        return studentRepository.getStudentByUsername(username);
    }

    @Override
    public Set<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    @Override
    public Set<Student> getStudentsByMajor(String major) {
        return studentRepository.getStudentsByMajor(major);
    }

    @Override
    public void addStudent(Student student) {
        studentRepository.addStudent(student);
    }
}
