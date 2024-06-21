package com.gestion_de_Tickets.ticket_manager.entity;

import jakarta.persistence.Entity;

@Entity
public class Admin extends Utilisateur {
    public Admin(Long id, String username, String email) {
        super(id, username, email);
    }
    // Methods specific to Admin
}