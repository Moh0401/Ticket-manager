package com.gestion_de_Tickets.ticket_manager.repository;

import com.gestion_de_Tickets.ticket_manager.modele.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}