package com.StudentManagementSystem.Traning.exception;

import javax.management.RuntimeErrorException;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(Long id) {
        super("Student " + id + " not found");
    }
}
