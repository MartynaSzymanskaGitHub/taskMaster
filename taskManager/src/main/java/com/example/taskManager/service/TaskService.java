package com.example.taskManager.service;
import com.example.taskManager.dto.CreateTaskDto;
import com.example.taskManager.dto.TaskDto;
import com.example.taskManager.model.Task;
import com.example.taskManager.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    public List<TaskDto> getAll() {
        return taskRepository.findAll()
                .stream()
                .map(task -> new TaskDto(
                        task.getId(),
                        task.getTitle(),
                        task.getDescription(),
                        task.getDone(),
                        task.getDueDate()
                ))
                .collect(Collectors.toList());
    }

    public void save(CreateTaskDto taskDto) {
        Task task = Task.builder()
                .title(taskDto.getName())
                .description(taskDto.getDescription())
                .dueDate(taskDto.getDueDate())
                .done(false)
                .build();
        taskRepository.save(task);
    }
}
