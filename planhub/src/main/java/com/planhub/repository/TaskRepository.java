package com.planhub.repository;

import com.planhub.model.Task;
import com.planhub.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByProject(Project project);
}
