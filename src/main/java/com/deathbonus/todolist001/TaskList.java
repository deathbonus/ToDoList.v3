package com.deathbonus.todolist001;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalTime;
import java.util.UUID;

@Entity
public class TaskList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private LocalTime creationDate;
    private LocalTime changeDate;
    private String name;
    private int completeTasksCounter;
    private long taskListId;


}
