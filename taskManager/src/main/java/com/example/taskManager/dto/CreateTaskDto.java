package com.example.taskManager.dto;


import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateTaskDto {
    String name;
    String description;
    LocalDate dueDate;
}
