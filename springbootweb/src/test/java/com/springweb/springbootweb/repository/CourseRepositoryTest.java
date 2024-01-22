package com.springweb.springbootweb.repository;

import com.springweb.springbootweb.entity.Course;
import com.springweb.springbootweb.entity.Student;
import com.springweb.springbootweb.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void printCourses(){
        List<Course> courses = courseRepository.findAll();
        System.out.println("courses = " + courses);
    }

    @Test
    public void SaveCourseWithTeacher(){
        Teacher teacher = Teacher.builder()
                .lastName("Kumar")
                .firstName("praveen")
                .build();

        Course course = Course.builder()
                .title("Python")
                .credit(8)
                .teacher(teacher)
                .build();
        courseRepository.save(course);
    }

    @Test
    public void findAllPagination(){
        Pageable firstPageWithThreeRecords = PageRequest.of(0,3);
        Pageable secondPageWithThreeRecords = PageRequest.of(1,2);
        Long totalElements = courseRepository.findAll(firstPageWithThreeRecords).getTotalElements();
        List<Course> courses = courseRepository.findAll(firstPageWithThreeRecords).getContent();
        System.out.println("courses = " + courses + totalElements);
    }

    @Test
    public void findAllWithSorting(){
        Pageable sortByTitle = PageRequest.of(0,2, Sort.by("courseTitle"));
        Pageable sortByCredit = PageRequest.of(0,2, Sort.by("credit").descending());
        List<Course> courses = courseRepository.findAll(sortByTitle).getContent();
        System.out.println("courses = " + courses );
    }

    @Test
    public void printFindByTitleContaining(){
        Pageable firstPageTenRecords = PageRequest.of(0,10);
        List<Course> courses = courseRepository.findByTitleContaining("D",firstPageTenRecords).getContent();
        System.out.println("courses = "+courses);
    }

    @Test
    public void saveCourseWithStudentAndTeacher() {
        Teacher teacher = Teacher
                .builder()
                .firstName("Lizza")
                .lastName("kumar")
                .build();
        Student student = Student
                .builder()
                .firstName("Abhishek")
                .lastName("kumar")
                .emailId("abhishek@gmail.com")
                .build();
        Course course = Course
                .builder()
                .title("AI")
                .credit(12)
                .teacher(teacher)
                .build();
        course.addStudents(student);
        courseRepository.save(course);
    }
}