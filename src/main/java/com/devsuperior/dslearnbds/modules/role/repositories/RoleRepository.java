package com.devsuperior.dslearnbds.modules.role.repositories;

import com.devsuperior.dslearnbds.modules.role.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
