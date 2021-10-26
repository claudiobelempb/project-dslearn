package com.devsuperior.dslearnbds.modules.notification.repositories;

import com.devsuperior.dslearnbds.modules.notification.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
