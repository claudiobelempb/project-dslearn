package com.devsuperior.dslearnbds.modules.course.repositories;

import com.devsuperior.dslearnbds.modules.course.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
