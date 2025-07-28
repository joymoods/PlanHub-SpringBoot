package com.planhub.service;

import com.planhub.model.Task;
import com.planhub.model.Project;
import com.planhub.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public Task save(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public List<Task> findByProject(Project project) {
        return taskRepository.findByProject(project);
    }

    public Task findById(Long id) {
        return taskRepository.findById(id).orElseThrow();
    }

    public void delete(Long id) {
        taskRepository.deleteById(id);
    }
}
