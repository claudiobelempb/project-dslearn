package com.devsuperior.dslearnbds.modules.lesson.repositories;

import com.devsuperior.dslearnbds.modules.lesson.entities.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
}
