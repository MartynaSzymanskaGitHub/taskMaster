package com.example.taskManager.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TaskDto {
    Long id;
    String name;
    String description;
    boolean done;
}
