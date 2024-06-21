package com.gestion_de_Tickets.ticket_manager.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Formateur extends Utilisateur {
    public Formateur(Long id, String username, String email) {
        super(id, username, email);
    }
    // Methods specific to Formateur
}