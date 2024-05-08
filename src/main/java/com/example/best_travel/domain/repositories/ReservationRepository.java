package com.example.best_travel.domain.repositories;

import com.example.best_travel.domain.entities.jpa.ReservationEntity;
import com.example.best_travel.domain.entities.jpa.TicketEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.UUID;

public interface ReservationRepository extends CrudRepository<ReservationEntity, UUID> {

    Optional<TicketEntity> findByTourId(Long id);

}
