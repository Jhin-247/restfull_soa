package com.example.restful.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;

@Data
@Entity
@Table(name = "student")
@Proxy(lazy = false)
public class Student {
    @Id
    @GeneratedValue(generator = "Student_generator")
    @GenericGenerator(name = "Student_generator", strategy = "com.example.restful.entity.generator.StudentIdGenerator")
    private String msv;
    private String name;
}
