package com.devsuperior.dslearnbds.modules.deliver.services;

import com.devsuperior.dslearnbds.modules.deliver.dto.DeliverRevisionDTO;
import com.devsuperior.dslearnbds.modules.deliver.entities.Deliver;
import com.devsuperior.dslearnbds.modules.deliver.repositories.DeliverRepository;
import com.devsuperior.dslearnbds.shared.exceptions.services.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeliverService {

  @Autowired
  private DeliverRepository deliverRepository;

  @PreAuthorize("hasAnyRole('ADMIN', 'INSTRUCTOR')")
  @Transactional
  public void saveRevision(Long id, DeliverRevisionDTO deliverRevisionDTO) {
    try {
      Deliver deliver = deliverRepository.getOne(id);

      deliver.setStatus(deliverRevisionDTO.getStatus());
      deliver.setFeedback(deliverRevisionDTO.getFeedback());
      deliver.setCorrectCount(deliverRevisionDTO.getCorrectCount());
      deliverRepository.save(deliver);
    } catch (EmptyResultDataAccessException e) {
      throw new ResourceNotFoundException("ID not found" + id);
    }
  }
}
