package com.app.services;

import org.springframework.stereotype.Service;
import com.app.entities.SoftwareEngineer;
import com.app.repositories.SoftwareEngineerRepo;

import java.util.List;

@Service
public class SoftwareEngineerService {
    private final SoftwareEngineerRepo softwareEngineerRepo;

    public SoftwareEngineerService(SoftwareEngineerRepo softwareEngineerRepo) {
        this.softwareEngineerRepo = softwareEngineerRepo;
    }

    public SoftwareEngineer get (int id, String name) {
        String queriedName = name != null ? name : "default user";
        return softwareEngineerRepo.queryData(id, queriedName); // get data from DB
    }

    public List<SoftwareEngineer> getAll() {
        return softwareEngineerRepo.queryAll();
    }
}
