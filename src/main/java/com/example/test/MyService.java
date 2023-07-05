package com.example.test;

import org.springframework.stereotype.Service;

import com.example.test.experiments.*;

@Service
public class MyService {

    public String doSomething() {
        // Implementiere hier deine Geschäftslogik
        return Left.name + Right.name + Left.lookRight + Right.lookLeft;
    }

    // Weitere Service-Methoden hier...
}