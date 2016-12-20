import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashSet;
import java.util.Set;

import godziszewski.patryk.VirtualDeansOffice.config.RootConfig;
import godziszewski.patryk.VirtualDeansOffice.model.Student;
import godziszewski.patryk.VirtualDeansOffice.model.StudentBuilder;
import godziszewski.patryk.VirtualDeansOffice.repository.StudentRepository;

import static godziszewski.patryk.VirtualDeansOffice.model.StudentBuilder.createStudent;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

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
        Set<Student> students = studentRepository.getAllStudents();
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
                        .withName("Marek")
                        .withSurname("Kondrat")
                        .withUsername("userKon")
                        .withPassword("password")
                        .build();
        Set<String> s1Majors = new HashSet<>();
        s1Majors.add("IT");
        s1.setMajors(s1Majors);

        Student s2 =
                createStudent()
                        .withName("Anna")
                        .withSurname("Nowak")
                        .withUsername("annNowak")
                        .withPassword("password")
                        .build();
        Set<String> s2Majors = new HashSet<>();
        s2Majors.add("Journalism");
        s2.setMajors(s2Majors);

        studentRepository.addStudent(s1);
        studentRepository.addStudent(s2);

        Set<Student> foundStudents = studentRepository.getStudentsByMajor("IT");
        assertTrue(foundStudents.contains(s1));
        assertFalse(foundStudents.contains(s2));
    }
    @Test
    public void whenGetStudentByUsernameThatDoesntExistsThenNullIsReturned() {
        assertNull(studentRepository.getStudentByUsername("userThatDoesntExists"));
    }

}
