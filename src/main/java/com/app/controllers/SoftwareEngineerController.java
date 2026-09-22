package com.app.controllers;

import org.springframework.web.bind.annotation.*;

import com.app.services.SoftwareEngineerService;
import com.app.entities.SoftwareEngineer;
import java.util.List;

@RestController
@RequestMapping("/engineers")
public class SoftwareEngineerController {
    private final SoftwareEngineerService softwareEngineerService;

    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    @GetMapping()
    public List<SoftwareEngineer> getAllSoftwareEngineer() {
        return softwareEngineerService.getAll();
    }

    @GetMapping("/{id}")
    public SoftwareEngineer getEngineerById(@PathVariable int id, @RequestParam String name) {
        return softwareEngineerService.get(id, name);
    }
}
