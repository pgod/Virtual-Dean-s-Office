import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import godziszewski.patryk.VirtualDeansOffice.config.RootConfig;
import godziszewski.patryk.VirtualDeansOffice.model.StudentBuilder;
import godziszewski.patryk.VirtualDeansOffice.repository.StudentRepository;
import godziszewski.patryk.VirtualDeansOffice.model.Student;

import static godziszewski.patryk.VirtualDeansOffice.model.StudentBuilder.createStudent;
import static org.junit.Assert.*;

/**
 * Created by Patryk on 2016-12-20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
public class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;
    @Test
    public void whenGetAllStudentsThenResultIsNotNullOrEmpty() {
        List<Student> students = studentRepository.getAllStudents();
        assertNotNull(students);
        assertFalse(students.isEmpty());
    }
    @Test
    public void whenCreatingNewStudentThenFoundObjectIsEqual() {
        Student newStudent =
                StudentBuilder
                .createStudent()
                .withName("Tomasz")
                .withSurname("Mazur")
                .withUsername("user12")
                .withPassword("password")
                .build();
        studentRepository.addStudent(newStudent);
        Student foundStudent = studentRepository
                .getStudentByUsername(newStudent.getUsername());

        assertEquals(newStudent,foundStudent);

    }
    @Test
    public void whenFindStudentsByMajorThenCorrectStudentsAreReturned() {
        Student s1 =
                createStudent()
                        .withName("Jan")
                        .withSurname("Kowalski")
                        .withUsername("user")
                        .withPassword("password")
                        .build();
        List<String> s1Majors = new ArrayList<>();
        s1Majors.add("IT");
        s1.setMajors(s1Majors);

        Student s2 =
                createStudent()
                        .withName("Anna")
                        .withSurname("Nowak")
                        .withUsername("annNow")
                        .withPassword("password")
                        .build();
        List<String> s2Majors = new ArrayList<>();
        s2Majors.add("Journalism");
        s2.setMajors(s2Majors);

        studentRepository.addStudent(s1);
        studentRepository.addStudent(s2);

        List<Student> foundStudents = studentRepository.getStudentsByMajor("IT");
        assertTrue(foundStudents.contains(s1));
        assertFalse(foundStudents.contains(s2));
    }
    @Test
    public void whenGetStudentByUsernameThatDoesntExistsThenNullIsReturned() {
        assertNull(studentRepository.getStudentByUsername("userThatDoesntExists"));
    }

}
