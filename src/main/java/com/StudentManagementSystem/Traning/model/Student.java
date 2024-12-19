package com.StudentManagementSystem.Traning.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "student")
public class Student {
    @Id
    private Long id;
    private String studentName;
    private String studentEmail;
    private String studentPassword;
    private String level;


    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<student_trainings> studentTrainings;



     // دور الطالب (طالب / أدمن)

    @OneToMany(mappedBy = "student")
    private List<Visit> visits;

    @OneToMany(mappedBy = "student")
    private List<Training> trainings;


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }



}




