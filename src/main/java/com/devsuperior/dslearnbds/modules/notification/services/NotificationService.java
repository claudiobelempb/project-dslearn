package com.devsuperior.dslearnbds.modules.notification.services;

import com.devsuperior.dslearnbds.modules.notification.dto.NotificationDTO;
import com.devsuperior.dslearnbds.modules.notification.entities.Notification;
import com.devsuperior.dslearnbds.modules.notification.repositories.NotificationRepository;
import com.devsuperior.dslearnbds.modules.user.entities.User;
import com.devsuperior.dslearnbds.modules.user.services.UserAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class NotificationService {

  @Autowired
  private NotificationRepository notificationRepository;

  @Autowired
  private UserAuthService userAuthService;

  @Transactional(readOnly = true)
  public Page<NotificationDTO> notificationsForCurrentUser(Pageable pageable) {

    User user = userAuthService.authenticated();
    Page<Notification> notifications = notificationRepository.findByUser(user, pageable);
    return notifications.map(notification -> new NotificationDTO(notification));

  }
}
