package com.gestion_de_Tickets.ticket_manager.Service;

import com.gestion_de_Tickets.ticket_manager.Repository.FormateurRepository;
import com.gestion_de_Tickets.ticket_manager.Repository.TicketRepository;
import com.gestion_de_Tickets.ticket_manager.entity.Formateur;
import com.gestion_de_Tickets.ticket_manager.entity.Ticket;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Getter
@Setter
@Service
public class FormateurService {

    @Autowired
    private FormateurRepository formateurRepository;

    @Autowired
    private TicketRepository ticketRepository;

    public Formateur save(Formateur formateur) {
        return formateurRepository.save(formateur);
    }

    public List<Formateur> getAllFormateurs() {
        return formateurRepository.findAll();
    }

    public Formateur getFormateurById(Long id) {
        return formateurRepository.findById(id).orElse(null);
    }

    public void deleteFormateur(Long id) {
        formateurRepository.deleteById(id);
    }

    // Specific methods for Formateur

    public Ticket assignerTicket(Long ticketId, Long formateurId) {
        Ticket ticket = ticketRepository.findById(ticketId).orElse(null);
        if (ticket != null) {
            Formateur formateur = formateurRepository.findById(formateurId).orElse(null);
            if (formateur != null) {
                ticket.setFormateur(formateur);
                ticketRepository.save(ticket);
            }
        }
        return ticket;
    }

    public Ticket mettreAJourTicket(Ticket updatedTicket) {
        Ticket existingTicket = ticketRepository.findById(updatedTicket.getId()).orElse(null);
        if (existingTicket != null) {
            existingTicket.setDescription(updatedTicket.getDescription());
            existingTicket.setPriorite(updatedTicket.getPriorite());
            existingTicket.setStatut(updatedTicket.getStatut());
            ticketRepository.save(existingTicket);
        }
        return existingTicket;
    }

    public Ticket cloturerTicket(Long ticketId) {
        Ticket ticket = ticketRepository.findById(ticketId).orElse(null);
        if (ticket != null) {
            ticket.setStatut("Clôturé");
            ticketRepository.save(ticket);
        }
        return ticket;
    }
}