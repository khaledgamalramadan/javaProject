package com.StudentManagementSystem.Traning.reposatory;

import com.StudentManagementSystem.Traning.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;



public interface StudentRepository extends JpaRepository <Student,Long>{

}
