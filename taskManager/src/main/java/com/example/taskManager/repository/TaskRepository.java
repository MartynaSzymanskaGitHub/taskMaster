package com.example.taskManager.repository;


import com.example.taskManager.dto.CreateTaskDto;
import com.example.taskManager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    void save(CreateTaskDto taskDto);
}
