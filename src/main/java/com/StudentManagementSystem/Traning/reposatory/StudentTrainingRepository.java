package com.StudentManagementSystem.Traning.reposatory;
import com.StudentManagementSystem.Traning.model.student_trainings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentTrainingRepository extends JpaRepository<student_trainings, Long> {
    // يمكنك إضافة استعلامات مخصصة هنا إذا لزم الأمر
}
