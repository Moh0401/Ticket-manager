package com.gestion_de_Tickets.ticket_manager.Controller;

import com.gestion_de_Tickets.ticket_manager.Service.ApprenantService;
import com.gestion_de_Tickets.ticket_manager.entity.Apprenant;
import com.gestion_de_Tickets.ticket_manager.entity.BaseDeConnaissance;
import com.gestion_de_Tickets.ticket_manager.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apprenants")
public class ApprenantController {

    @Autowired
    private ApprenantService apprenantService;

    @PostMapping
    public Apprenant createApprenant(@RequestBody Apprenant apprenant) {
        return apprenantService.save(apprenant);
    }

    @GetMapping
    public List<Apprenant> getAllApprenants() {
        return apprenantService.getAllApprenants();
    }

    @GetMapping("/{id}")
    public Apprenant getApprenantById(@PathVariable Long id) {
        return apprenantService.getApprenantById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteApprenant(@PathVariable Long id) {
        apprenantService.deleteApprenant(id);
    }

    @GetMapping("/base-de-connaissances")
    public List<BaseDeConnaissance> consulterBaseDeConnaissances() {
        return apprenantService.consulterBaseDeConnaissances();
    }

    @PostMapping("/tickets")
    public Ticket soumettreTicket(@RequestBody Ticket ticket) {
        return apprenantService.soumettreTicket(ticket);
    }

    @GetMapping("/{id}/tickets")
    public List<Ticket> voirTickets(@PathVariable Long id) {
        Apprenant apprenant = apprenantService.getApprenantById(id);
        return apprenantService.voirTickets(apprenant);
    }
}
