package com.gestion_de_Tickets.ticket_manager.services;

import com.gestion_de_Tickets.ticket_manager.modele.BaseDeConnaissance;
import com.gestion_de_Tickets.ticket_manager.repository.BaseDeConnaissanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseDeConnaissanceService {
    @Autowired
    private BaseDeConnaissanceRepository baseDeConnaissanceRepository;

    public BaseDeConnaissance save(BaseDeConnaissance baseDeConnaissance) {
        return baseDeConnaissanceRepository.save(baseDeConnaissance);
    }

    public List<BaseDeConnaissance> getAllBasesDeConnaissance() {
        return baseDeConnaissanceRepository.findAll();
    }

    public BaseDeConnaissance getBaseDeConnaissanceById(Long id) {
        return baseDeConnaissanceRepository.findById(id).orElse(null);
    }

    public void deleteBaseDeConnaissance(Long id) {
        baseDeConnaissanceRepository.deleteById(id);
    }
}