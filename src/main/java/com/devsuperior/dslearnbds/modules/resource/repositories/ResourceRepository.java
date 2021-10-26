package com.devsuperior.dslearnbds.modules.resource.repositories;

import com.devsuperior.dslearnbds.modules.resource.entities.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
}
