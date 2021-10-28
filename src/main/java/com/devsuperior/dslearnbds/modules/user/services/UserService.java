package com.devsuperior.dslearnbds.modules.user.services;

import com.devsuperior.dslearnbds.modules.user.dto.UserDTO;
import com.devsuperior.dslearnbds.modules.user.entities.User;
import com.devsuperior.dslearnbds.modules.user.repositories.UserRepository;
import com.devsuperior.dslearnbds.shared.exceptions.services.ResourceNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserService implements UserDetailsService {

  private static final Logger logger = LoggerFactory.getLogger(UserService.class);

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private UserAuthService userAuthService;

  @Transactional(readOnly = true)
  public Page<UserDTO> index(Pageable pageable) {
    Page<User> users = userRepository.findAll(pageable);
    return users.map((user -> new UserDTO(user)));
  }

  @Transactional(readOnly = true)
  public UserDTO show(Long id) {

    userAuthService.validateSelfOrAdmin(id);

    Optional<User> obj = userRepository.findById(id);
    User user = obj.orElseThrow(() -> new ResourceNotFoundException("User not found!"));
    return new UserDTO(user);
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

    User user = userRepository.findByEmail(username);

    if(user == null) {
      logger.error("User not found: " + username);
      throw new UsernameNotFoundException("Email not found");
    }
    logger.info("User found: " + username);
    return user;
  }
}
