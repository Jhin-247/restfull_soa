package com.example.restful.entity;

import lombok.Data;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;

@Entity
@Table
@Data
@Proxy(lazy = false)
public class StudentSubject {
    @Id
    private int id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "msv")
    private Student student;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subjectId")
    private Subject subject;

    private double grade;
}
