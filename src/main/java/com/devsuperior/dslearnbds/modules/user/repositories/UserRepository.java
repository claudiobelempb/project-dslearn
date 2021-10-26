package com.devsuperior.dslearnbds.modules.user.repositories;

import com.devsuperior.dslearnbds.modules.user.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
