package com.deathbonus.todolist001;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    private final AtomicLong counter = new AtomicLong();
    UUID id = UUID.randomUUID();

    @PostMapping("/tasks")
    public Task task(@RequestParam(value = "name", defaultValue = "name") String name, @RequestParam(value = "description", defaultValue = "description") String description) {
//        return new Task(String.format(template, name));
        return new Task(name,description, id);
    }
}
