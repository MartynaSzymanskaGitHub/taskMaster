package com.example.taskManager.controller;

import com.example.taskManager.dto.CreateTaskDto;
import com.example.taskManager.dto.TaskDto;
import com.example.taskManager.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @GetMapping("/all")
    public ResponseEntity<?> getAllTasks(){
        return ResponseEntity.ok(taskService.getAll());
    }

    @PostMapping
    public ResponseEntity<?> addTask(@RequestBody CreateTaskDto createTaskDto){
        taskService.save(createTaskDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}

