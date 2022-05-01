package com.example.restful.services.imp;

import com.example.restful.entity.Student;
import com.example.restful.repository.StudentRepository;
import com.example.restful.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public Student getStudentById(String id) {
        return repository.getById(id);
    }

    @Override
    public Student addStudent(Student student) {
        return repository.save(student);
    }
}
