package com.devsuperior.dslearnbds.modules.notification.repositories;

import com.devsuperior.dslearnbds.modules.notification.entities.Notification;
import com.devsuperior.dslearnbds.modules.user.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

  Page<Notification> findByUser(User user, Pageable pageable);

}
