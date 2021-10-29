package com.devsuperior.dslearnbds.modules.notification.resources;

import com.devsuperior.dslearnbds.modules.notification.dto.NotificationDTO;
import com.devsuperior.dslearnbds.modules.notification.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.io.Serializable;

@RestController
@RequestMapping(value = "/notifications")
public class NotificationResource implements Serializable {

  private static final long serialVersionUID = 1L;

  @Autowired
  private NotificationService notificationService;

  @GetMapping
  public ResponseEntity<Page<NotificationDTO>> notificationsForCurrentUser(Pageable pageable){
    Page<NotificationDTO> notification = notificationService.notificationsForCurrentUser(pageable);
    return ResponseEntity.ok().body(notification);
  }

}
