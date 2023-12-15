package com.secondproject.Springdatajpa.repository;

import com.secondproject.Springdatajpa.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentRepositoryTest {
   @Autowired
   private  StudentRepository studentRepository;
   @Test
   public void saveStudent()
   {
       Student student=Student.builder().emailId("abc@gmail.com").firstName("john").lastName("sina").
                       guardianName("cris").guardianEmail("cris@gmail.com").guardianMobile("9682742374").build();
       studentRepository.save(student);
   }
   @Test
    public void printAllStudent()
   {
       List <Student> studentList=studentRepository.findAll();
       System.out.println("studentList=" + studentList);
   }

}