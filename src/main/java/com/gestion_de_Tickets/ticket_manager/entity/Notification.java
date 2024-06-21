package com.gestion_de_Tickets.ticket_manager.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;

    @ManyToOne
    private Utilisateur utilisateur;

    @ManyToOne
    private Ticket ticket;

    // Getters and Setters
}
