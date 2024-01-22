package com.springweb.springbootweb.error.repository;

import com.springweb.springbootweb.entity.Guardian;
import com.springweb.springbootweb.entity.Student;
import com.springweb.springbootweb.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.SocketOption;
import java.util.List;

@SpringBootTest
@DataJpaTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

//    @Test
//    public void saveStudent(){
//        Student student = Student.builder()
//                .emailId("praveen@gmali.com")
//                .firstName("praveen")
//                .lastName("Kumar")
//                .guardianName("Naveen")
//                .guardianEmail("Naveen@gmail.com")
//                .guardianPhone("8686382597")
//                .build();
//        studentRepository.save(student);
//    }

    @Test
    public void printAllStudent() {
        List<Student> studentList = studentRepository.findAll();
        System.out.println("Student list =" + studentList);
    }

    @Test
    public void saveStdentWithGaurdian(){

        Guardian guardian = Guardian.builder()
                .name("Naveen")
                .email("Naveen@gmail.com")
                .mobile("9999999999")
                .build();

        Student student = Student.builder()
                .firstName("Praveen")
                .emailId("Praveen@gmail.com")
                .lastName("kumar")
                .guardian(guardian)
                .build();

        studentRepository.save(student);
    }

    @Test
    public void printStudentByFirstName(){
        List<Student> students = studentRepository.findByFirstName("Praveen");
        System.out.println("student = " + students);
    }

    @Test
    public void printStudentByFirstNameContaining(){
        List<Student> students = studentRepository.findByFirstNameContaining("Pra");
        System.out.println("student = " + students);
    }

    @Test
    public void printStudentBasedOnGuardianName(){
        List<Student> students = studentRepository.findByGuardianName("Naveen");
    }

    @Test
    public void printGetStudentByEmailAddress(){
        Student student = studentRepository.getStudentByEmailAddress("Praveen@gamil.com");
    }

    @Test
    public void updateStudentNameByEmailIdTest(){
        studentRepository.updateStudentNameByEmailID("praveenu", "Praveen@gmaili.com");
    }
}