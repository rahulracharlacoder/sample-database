package com.databaseconnection.SampleDatabase.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "Id")
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", unique = true,nullable = false)
    private String email;

    @Column(name = "grade", nullable = false)
    private String grade;

    @Column(name = "dob", nullable = false)
    private String dob;

    @Column(name = "password", nullable = false)
    private String password;

}
