package com.gestion_de_Tickets.ticket_manager.Controller;

import com.gestion_de_Tickets.ticket_manager.Service.FormateurService;
import com.gestion_de_Tickets.ticket_manager.entity.Formateur;
import com.gestion_de_Tickets.ticket_manager.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/formateurs")
public class FormateurController {

    @Autowired
    private FormateurService formateurService;

    @PostMapping
    public Formateur createFormateur(@RequestBody Formateur formateur) {
        return formateurService.save(formateur);
    }

    @GetMapping
    public List<Formateur> getAllFormateurs() {
        return formateurService.getAllFormateurs();
    }

    @GetMapping("/{id}")
    public Formateur getFormateurById(@PathVariable Long id) {
        return formateurService.getFormateurById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteFormateur(@PathVariable Long id) {
        formateurService.deleteFormateur(id);
    }

    @PostMapping("/{formateurId}/assigner-ticket/{ticketId}")
    public Ticket assignerTicket(@PathVariable Long formateurId, @PathVariable Long ticketId) {
        return formateurService.assignerTicket(ticketId, formateurId);
    }

    @PutMapping("/mettre-a-jour-ticket")
    public Ticket mettreAJourTicket(@RequestBody Ticket ticket) {
        return formateurService.mettreAJourTicket(ticket);
    }

    @PostMapping("/cloturer-ticket/{ticketId}")
    public Ticket cloturerTicket(@PathVariable Long ticketId) {
        return formateurService.cloturerTicket(ticketId);
    }
}
