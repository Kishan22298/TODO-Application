package com.todolist.Todo.Lists.Application.service;

import com.todolist.Todo.Lists.Application.entity.Task;

import java.util.List;

public interface TaskService {
    List<Task> getAllTasks();

    void createTask(String title);

    void deleteTask(Long id);

    void toggleTask(Long id);

}
