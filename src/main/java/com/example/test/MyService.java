package com.example.test;

import org.springframework.stereotype.Service;

import com.example.test.experiments.*;

@Service
public class MyService {

    public String doSomething() {
        // Implementiere hier deine Geschäftslogik
        return Right.lookLeft.name + Left.lookRight.name;
    }

    // Weitere Service-Methoden hier...
}