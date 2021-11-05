package com.devsuperior.dslearnbds.modules.deliver.resources;

import com.devsuperior.dslearnbds.modules.deliver.dto.DeliverRevisionDTO;
import com.devsuperior.dslearnbds.modules.deliver.services.DeliverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/deliveries")
public class DeliverResource {

  @Autowired
  private DeliverService deliverService;


  @PutMapping(value = "/{id}")
  public ResponseEntity<Void> saveRevision(@PathVariable Long id, @RequestBody DeliverRevisionDTO deliverRevisionDTO){

    deliverService.saveRevision(id, deliverRevisionDTO);
    return ResponseEntity.noContent().build();
  }

}
