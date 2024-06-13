package com.gestion_de_Tickets.ticket_manager.repository;

import com.gestion_de_Tickets.ticket_manager.modele.BaseDeConnaissance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseDeConnaissanceRepository extends JpaRepository<BaseDeConnaissance, Long> {
}