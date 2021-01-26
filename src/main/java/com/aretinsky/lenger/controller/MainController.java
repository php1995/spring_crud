package com.aretinsky.lenger.controller;

import com.aretinsky.lenger.service.TasksService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@NoArgsConstructor
public class MainController {

    private TasksService tasksService;

    @RequestMapping("/")
    public String main(Model model) {
        model.addAttribute("tasks", tasksService.findAllTasks());
        return "greeting";
    }
}
