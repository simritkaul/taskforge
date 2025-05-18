package com.simritkaul.taskforge.core;

import java.time.Instant;
import java.util.Map;
import java.util.Optional;

public interface TaskScheduler {
    String submitTask(String name, String type, Map<String, Object> parameters, TaskPriority priority);
    String scheduleTask(String name, String type, Map<String, Object> parameters, TaskPriority priority, Instant scheduledTime);
    boolean cancelTask(Task task);
    Optional<Task> getTaskStatus (String taskId);
}
