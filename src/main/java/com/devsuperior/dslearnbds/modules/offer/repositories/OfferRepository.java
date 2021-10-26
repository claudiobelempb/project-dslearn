package com.devsuperior.dslearnbds.modules.offer.repositories;

import com.devsuperior.dslearnbds.modules.offer.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepository extends JpaRepository<Offer, Long> {
}
