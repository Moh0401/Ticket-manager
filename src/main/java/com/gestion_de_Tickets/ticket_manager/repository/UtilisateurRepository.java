package com.gestion_de_Tickets.ticket_manager.repository;

import com.gestion_de_Tickets.ticket_manager.modele.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
}
