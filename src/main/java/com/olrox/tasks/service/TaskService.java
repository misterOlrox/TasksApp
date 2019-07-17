package com.olrox.tasks.service;

import com.olrox.tasks.domain.Task;

public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);
}
