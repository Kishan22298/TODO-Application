package com.todolist.Todo.Lists.Application.repository;

import com.todolist.Todo.Lists.Application.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
