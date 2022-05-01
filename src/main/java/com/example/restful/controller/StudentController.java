package com.example.restful.controller;

import com.example.restful.entity.Student;
import com.example.restful.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping("/getStudentById")
    public Student getStudentByID(@RequestParam(name = "id") String id){
        return studentService.getStudentById(id);
    }
}
