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
    Urgency urgency;
    private boolean isComplete;
    private long taskListId;

    protected Task() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Urgency getUrgency() {
        return urgency;
    }

    public void setUrgency(Urgency urgency) {
        this.urgency = urgency;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void switchStatus() {
        isComplete = !isComplete;
    }

    public long getTaskListId() {
        return taskListId;
    }

    public void setTaskListId(long taskListId) {
        this.taskListId = taskListId;
    }
}
