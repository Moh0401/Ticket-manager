package com.gestion_de_Tickets.ticket_manager.Service;

import com.gestion_de_Tickets.ticket_manager.entity.Utilisateur;
import com.gestion_de_Tickets.ticket_manager.Repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.List;

@Service


public class UtilisateurService {
    @Autowired
    private UtilisateurRepository utilisateurRepository;


    public Utilisateur save(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }



    public List<Utilisateur> getAllUtilisateurs() {
        return utilisateurRepository.findAll();}

    public Utilisateur getUtilisateurById(Long id) {
        return utilisateurRepository.findById(id).orElse(null);}

    public void deleteUtilisateur(Long id) {
        utilisateurRepository.deleteById(id);}
}
