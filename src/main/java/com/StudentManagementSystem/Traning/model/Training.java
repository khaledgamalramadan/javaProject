package com.StudentManagementSystem.Traning.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Training {

    @Id
    @GeneratedValue
    private Long id;

    private String company; // شركة التدريب
    private int duration; // مدة التدريب (بالأيام مثلاً)
    private LocalDate startDate; // تاريخ بداية التدريب
    private LocalDate endDate; // تاريخ نهاية التدريب

    // العلاقة مع كائن Student
    @ManyToOne
    private Student student;

    // Constructor بدون معلمات (اختياري)
    public Training() {}

    // Getter and Setter methods
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
