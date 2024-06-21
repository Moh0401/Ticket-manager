package com.gestion_de_Tickets.ticket_manager.Service;

import com.gestion_de_Tickets.ticket_manager.Repository.ApprenantRepository;
import com.gestion_de_Tickets.ticket_manager.Repository.FormateurRepository;
import com.gestion_de_Tickets.ticket_manager.entity.Apprenant;
import com.gestion_de_Tickets.ticket_manager.entity.Formateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private ApprenantRepository apprenantRepository;

    @Autowired
    private FormateurRepository formateurRepository;

    // Ajouter un formateur
    public Formateur ajouterFormateur(Formateur formateur) {
        return formateurRepository.save(formateur);
    }

    // Supprimer un formateur
    public void supprimerFormateur(Long id) {
        formateurRepository.deleteById(id);
    }

    // Supprimer un apprenant
    public void supprimerApprenant(Long id) {
        apprenantRepository.deleteById(id);
    }

    // Récupérer tous les formateurs
    public List<Formateur> getAllFormateurs() {
        return formateurRepository.findAll();
    }

    // Récupérer tous les apprenants
    public List<Apprenant> getAllApprenants() {
        return apprenantRepository.findAll();
    }
}
