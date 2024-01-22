package com.springweb.springbootweb.repository;

import com.springweb.springbootweb.entity.Course;
import com.springweb.springbootweb.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

//    @Test
//    public void saveTeacher(){
//        Course courseBD = Course.builder()
//                .credit(5)
//                .courseTitle("BD")
//                .build();
//        Course courseJava = Course.builder()
//                .credit(5)
//                .courseTitle("Java")
//                .build();
//        Teacher teacher = Teacher.builder()
//                .firstName("Sar")
//                .lastName("ala")
//                .courses(List.of(courseBD,courseJava))
//                .build();
//        teacherRepository.save(teacher);
//    }
}