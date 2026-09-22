package com.app.repositories;

import com.app.entities.SoftwareEngineer;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class SoftwareEngineerRepo {
    public SoftwareEngineer queryData(int id, String name) {
        return new SoftwareEngineer(id, name , "Spring Boot");
    }

    public List<SoftwareEngineer> queryAll() {
        return List.of(
                new SoftwareEngineer(1, "Duy", "ReactJS, NextJS, Redux, MUI, Tailwind"),
                new SoftwareEngineer(2, "Duy Pham", "NodeJS, Spring Boot, Docker"),
                new SoftwareEngineer(3, "Dylan", "Fullstack")
                );
    }
}
