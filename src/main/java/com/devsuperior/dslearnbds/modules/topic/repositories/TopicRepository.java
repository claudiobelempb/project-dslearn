package com.devsuperior.dslearnbds.modules.topic.repositories;

import com.devsuperior.dslearnbds.modules.topic.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}
