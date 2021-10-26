package com.devsuperior.dslearnbds.modules.user.resources;

import com.devsuperior.dslearnbds.modules.user.dto.UserDTO;
import com.devsuperior.dslearnbds.modules.user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

  @Autowired
  private UserService userService;

  @GetMapping
  public ResponseEntity<Page<UserDTO>> index(Pageable pageable){
    Page<UserDTO> users = userService.index(pageable);
    return ResponseEntity.ok().body(users);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<UserDTO> show(@PathVariable Long id){
    UserDTO user = userService.show(id);
    return ResponseEntity.ok().body(user);
  }
}
