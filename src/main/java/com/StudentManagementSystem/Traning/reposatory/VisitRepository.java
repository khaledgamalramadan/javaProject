package com.StudentManagementSystem.Traning.reposatory;
import com.StudentManagementSystem.Traning.model.Visit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VisitRepository extends JpaRepository<Visit, Long> {

}
