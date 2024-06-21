package com.gestion_de_Tickets.ticket_manager.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;
    private String description;
    private String statut;
    private String priorite;
    private String classification;

    @ManyToOne
    @JoinColumn(name = "apprenant_id")
    private Apprenant apprenant;

    @ManyToOne
    @JoinColumn(name = "base_de_connaissance_id")
    private BaseDeConnaissance baseDeConnaissance;

    @ManyToOne
    @JoinColumn(name = "formateur_id")
    private Formateur formateur;

    // Getters
    public Long getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public String getStatut() {
        return statut;
    }

    public String getPriorite() {
        return priorite;
    }

    public String getClassification() {
        return classification;
    }

    public Apprenant getApprenant() {
        return apprenant;
    }

    public BaseDeConnaissance getBaseDeConnaissance() {
        return baseDeConnaissance;
    }

    public Formateur getFormateur() {
        return formateur;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public void setPriorite(String priorite) {
        this.priorite = priorite;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public void setApprenant(Apprenant apprenant) {
        this.apprenant = apprenant;
    }

    public void setBaseDeConnaissance(BaseDeConnaissance baseDeConnaissance) {
        this.baseDeConnaissance = baseDeConnaissance;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }
}
