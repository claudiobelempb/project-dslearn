package com.devsuperior.dslearnbds.modules.user.services;

import com.devsuperior.dslearnbds.modules.user.entities.User;
import com.devsuperior.dslearnbds.modules.user.repositories.UserRepository;
import com.devsuperior.dslearnbds.shared.exceptions.services.ForbiddenException;
import com.devsuperior.dslearnbds.shared.exceptions.services.UnauthorizedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserAuthService {

  @Autowired
  private UserRepository userRepository;

  @Transactional(readOnly = true)
  public User authenticated(){
    try{
      String username = SecurityContextHolder.getContext().getAuthentication().getName();
      return userRepository.findByEmail(username);
    }catch (Exception e) {
      throw new UnauthorizedException("Invalid user");
    }
  }

  public void validateSelfOrAdmin(Long userId){
    User user = authenticated();
    if(!user.getId().equals(userId) && !user.hasHole("ROLE_ADMIN")){
      throw new ForbiddenException("Access denied");
    }
  }
}
