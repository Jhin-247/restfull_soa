package com.example.restful.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;

@Entity
@Data
@Proxy(lazy = false)
public class Subject {
    @Id
    @GeneratedValue(generator = "Subject_generator")
    @GenericGenerator(name = "Subject_generator", strategy = "com.example.restful.entity.generator.SubjectIdGenerator")
    private String subjectId;
    private String name;
    private int credits;
    private int semester;

}
