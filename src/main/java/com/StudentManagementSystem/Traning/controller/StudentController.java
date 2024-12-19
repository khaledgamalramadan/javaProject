package com.StudentManagementSystem.Traning.controller;

import com.StudentManagementSystem.Traning.model.Student;
import com.StudentManagementSystem.Traning.reposatory.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.StudentManagementSystem.Traning.exception.StudentNotFoundException;


import java.util.List;

@RestController
@CrossOrigin("http://localhost:5173")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/student")
    public Student newStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }
    @GetMapping("/students")
    List<Student> getStudents() {
        return studentRepository.findAll();

    }

    @GetMapping("/student/{id}")
    Student getStudentById(@PathVariable Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException(id));
    }


    @PutMapping("/student/{id}")
        Student updateUser(@RequestBody Student newStudent, @PathVariable Long id) {
        return studentRepository.findById(id)
                .map(student -> {
                    student.setStudentName(newStudent.getStudentName());
                    student.setStudentEmail(newStudent.getStudentEmail());
                    return studentRepository.save(student);
                }).orElseThrow(() -> new StudentNotFoundException(id));
    }


    @DeleteMapping("/student/{id}")
    String deletestudent(@PathVariable Long id){
        if(!studentRepository.existsById(id)){
            throw new StudentNotFoundException(id);
        }
        studentRepository.deleteById(id);
        return  "Student with id "+id+" has been deleted success ";
    }

}
