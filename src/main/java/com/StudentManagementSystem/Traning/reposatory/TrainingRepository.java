package com.StudentManagementSystem.Traning.reposatory;
import com.StudentManagementSystem.Traning.model.Training;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrainingRepository extends JpaRepository <Training, Long> {

}
