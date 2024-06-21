package com.gestion_de_Tickets.ticket_manager.Controller;

import com.gestion_de_Tickets.ticket_manager.Service.BaseDeConnaissanceService;
import com.gestion_de_Tickets.ticket_manager.entity.BaseDeConnaissance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bases-connaissances")
public class BaseDeConnaissanceController {
    @Autowired
    private BaseDeConnaissanceService baseDeConnaissanceService;

    @PostMapping
    public BaseDeConnaissance createBaseDeConnaissance(@RequestBody BaseDeConnaissance baseDeConnaissance) {
        return baseDeConnaissanceService.save(baseDeConnaissance);
    }

    @GetMapping
    public List<BaseDeConnaissance> getAllBasesDeConnaissance() {
        return baseDeConnaissanceService.getAllBasesDeConnaissance();
    }

    @GetMapping("/{id}")
    public BaseDeConnaissance getBaseDeConnaissanceById(@PathVariable Long id) {
        return baseDeConnaissanceService.getBaseDeConnaissanceById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBaseDeConnaissance(@PathVariable Long id) {
        baseDeConnaissanceService.deleteBaseDeConnaissance(id);
    }
}
