package com.simritkaul.taskforge.core;

public interface TaskProcessor {
    /**
     * Process a task and return the result
     *
     * @param task The task to process
     * @return Result of the task execution as a string
     * @throws Exception If task processing fails
     * */
    String process(Task task) throws Exception;

    /**
     * Returns the task type this processor can handle
     */
    String getTaskType();
}
