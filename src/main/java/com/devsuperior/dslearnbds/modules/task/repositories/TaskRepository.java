package com.devsuperior.dslearnbds.modules.task.repositories;

import com.devsuperior.dslearnbds.modules.task.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
