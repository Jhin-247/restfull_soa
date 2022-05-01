package com.example.restful.services;

import com.example.restful.entity.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {

    Student getStudentById(String id);

    Student addStudent(Student student);

}
