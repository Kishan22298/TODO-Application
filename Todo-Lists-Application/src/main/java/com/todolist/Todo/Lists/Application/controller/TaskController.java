package com.todolist.Todo.Lists.Application.controller;

import com.todolist.Todo.Lists.Application.entity.Task;
import com.todolist.Todo.Lists.Application.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/tasks")
    public String getTasks(Model model) {
        List<Task> tasks = taskService.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }

    @PostMapping("/tasks")
    public String createTask(@RequestParam String title) {
        // Implementation for creating a new task
        taskService.createTask(title);
        return "redirect:/api/tasks";
    }

    @GetMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id) {
        // Implementation for deleting a task by id
        taskService.deleteTask(id);
        return "redirect:/api/tasks";
    }

    @GetMapping("/{id}")
    public String toggleTask(@PathVariable Long id){
        // Implementation for toggling a task by id
        taskService.toggleTask(id);
        return "redirect:/api/tasks";
    }
}
