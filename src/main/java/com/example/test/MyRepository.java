package com.example.test;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

    public String getData() {
        // Datenbankzugriff hier...
        return "Data";
    }

    // Weitere Repository-Methoden hier...
}