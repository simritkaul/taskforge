package com.simritkaul.taskforge.persistence;

import com.simritkaul.taskforge.core.Task;
import com.simritkaul.taskforge.core.TaskStatus;

import java.util.List;
import java.util.Optional;

public interface TaskRepository {
    void save(Task task);
    Optional<Task> findById(String id);
    List<Task> findByStatus(TaskStatus status);
    List<Task> findByStatusOrderByPriority(TaskStatus status);
    List<Task> findByWorkerNodeId(String workerNodeId);
    void update(Task task);
    void delete(String id);
}
