package com.gestion_de_Tickets.ticket_manager.repository;

import com.gestion_de_Tickets.ticket_manager.modele.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
