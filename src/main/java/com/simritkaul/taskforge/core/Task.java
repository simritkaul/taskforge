package com.simritkaul.taskforge.core;

import java.io.Serializable;
import java.time.Instant;
import java.util.Map;
import java.util.UUID;

public class Task implements Serializable {
    private final String id;
    private final String name;
    private final String type;
    private final Map<String, Object> parameters;
    private TaskPriority priority;
    private TaskStatus status;
    private final Instant createdAt;
    private Instant scheduledAt;
    private Instant startedAt;
    private Instant completedAt;
    private String workerNodeId;
    private int retryCount;
    private int maxRetries;
    private String result;
    private String errorMessage;

    Task (String name, String type, Map<String, Object> parameters, TaskPriority priority) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.type = type;
        this.parameters = parameters;
        this.priority = priority;
        this.status = TaskStatus.PENDING;
        this.createdAt = Instant.now();
        this.retryCount = 0;
        this.maxRetries = 3; // Default
    }

    // Getters and setters
    public String getId () {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Map<String, Object> getParameters() {
        return parameters;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public void setPriority(TaskPriority priority) {
        this.priority = priority;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getScheduledAt() {
        return scheduledAt;
    }

    public void setScheduledAt(Instant scheduledAt) {
        this.scheduledAt = scheduledAt;
    }

    public Instant getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(Instant startedAt) {
        this.startedAt = startedAt;
    }

    public Instant getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(Instant completedAt) {
        this.completedAt = completedAt;
    }

    public String getWorkerNodeId() {
        return workerNodeId;
    }

    public void setWorkerNodeId(String workerNodeId) {
        this.workerNodeId = workerNodeId;
    }

    public int getRetryCount() {
        return retryCount;
    }

    public void incrementRetryCount() {
        this.retryCount++;
    }

    public int getMaxRetries() {
        return maxRetries;
    }

    public void setMaxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", status=" + status +
                ", priority=" + priority +
                '}';
    }

}
