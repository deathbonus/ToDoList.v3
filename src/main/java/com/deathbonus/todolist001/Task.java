package com.deathbonus.todolist001;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalTime;
import java.util.UUID;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private LocalTime creationDate;
    private LocalTime changeDate;
    private String name;
    private String description;
    public enum Urgency {VERY_LOW,LOW,MEDIUM,HIGH,VERY_HIGH}
    private Urgency urgency;
    private boolean isComplete;
    private UUID taskListId;

    protected Task() {}

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
        creationDate = LocalTime.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        changeDate = LocalTime.now();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        changeDate = LocalTime.now();
    }

//    public Urgency getUrgency() {
//        return urgency;
//    }

//    public void setUrgency(Urgency urgency) {
//        this.urgency = urgency;
//    }

    public boolean isComplete() {
        return isComplete;
    }

    public void switchStatus() {
        isComplete = !isComplete;
    }

    public UUID getTaskListId() {
        return taskListId;
    }

    public void setTaskListId(UUID taskListId) {
        this.taskListId = taskListId;
    }

    public UUID getId() {
        return id;
    }

    public LocalTime getCreationDate() {
        return creationDate;
    }

    public LocalTime getChangeDate() {
        return changeDate;
    }
}
