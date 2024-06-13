package com.gestion_de_Tickets.ticket_manager.modele;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="TICKET")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String statut;
    private String priorite;
    private String classification;

    @ManyToOne
    private Apprenant apprenant;

    @ManyToOne
    private Formateur formateur;

    // Getters and Setters
}
