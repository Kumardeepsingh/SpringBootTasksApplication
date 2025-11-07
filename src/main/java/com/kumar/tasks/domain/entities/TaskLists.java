package com.kumar.tasks.domain.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name ="task_lists")
public class TaskLists {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name ="id",nullable = false,updatable = false)
    private UUID id;

    @Column(name ="title", nullable = false)
    private String title;

    @Column(name = "desccription")
    private  String description;
    @OneToMany(mappedBy = "taskList", cascade = {
            CascadeType.REMOVE, CascadeType.PERSIST
    } )
    private List<Task> tasks;

    @Column(name = "created",nullable = false)
    private LocalDateTime created;

    @Column(name = "updated",nullable = false)
    private LocalDateTime updated;

    public TaskLists() {
    }

    public TaskLists(UUID id, String title, String description, List<Task> tasks, LocalDateTime created, LocalDateTime updated) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.tasks = tasks;
        this.created = created;
        this.updated = updated;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TaskLists taskLists = (TaskLists) o;
        return Objects.equals(id, taskLists.id) && Objects.equals(title, taskLists.title) && Objects.equals(description, taskLists.description) && Objects.equals(tasks, taskLists.tasks) && Objects.equals(created, taskLists.created) && Objects.equals(updated, taskLists.updated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, tasks, created, updated);
    }

    @Override
    public String toString() {
        return "TaskLists{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", tasks=" + tasks +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
