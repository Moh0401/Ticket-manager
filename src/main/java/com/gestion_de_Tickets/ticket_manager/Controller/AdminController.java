package com.gestion_de_Tickets.ticket_manager.Controller;

import com.gestion_de_Tickets.ticket_manager.Service.AdminService;
import com.gestion_de_Tickets.ticket_manager.entity.Apprenant;
import com.gestion_de_Tickets.ticket_manager.entity.Formateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/formateurs")
    public Formateur ajouterFormateur(@RequestBody Formateur formateur) {
        return adminService.ajouterFormateur(formateur);
    }

    @DeleteMapping("/formateurs/{id}")
    public void supprimerFormateur(@PathVariable Long id) {
        adminService.supprimerFormateur(id);
    }

    @DeleteMapping("/apprenants/{id}")
    public void supprimerApprenant(@PathVariable Long id) {
        adminService.supprimerApprenant(id);
    }

    @GetMapping("/formateurs")
    public List<Formateur> getAllFormateurs() {
        return adminService.getAllFormateurs();
    }

    @GetMapping("/apprenants")
    public List<Apprenant> getAllApprenants() {
        return adminService.getAllApprenants();
    }
}