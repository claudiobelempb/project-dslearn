package com.devsuperior.dslearnbds.modules.section.repositories;

import com.devsuperior.dslearnbds.modules.section.entities.Section;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRepository extends JpaRepository<Section, Long> {
}
