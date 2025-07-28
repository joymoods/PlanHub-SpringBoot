package com.planhub.controller;

import com.planhub.service.ProjectService;
import com.planhub.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
    @Autowired
    private ProjectService projectService;
    @Autowired
    private TaskService taskService;

    @GetMapping("/")
    public String dashboard(Model model) {
        model.addAttribute("projects", projectService.findAll());
        model.addAttribute("tasks", taskService.findAll());
        return "dashboard";
    }
}
