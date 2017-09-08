package br.eng.andreduarte.dispring.services;

import org.springframework.stereotype.Service;

/**
 * Created by Andre on 9/8/17.
 */
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Nerd - I was injected via constructor!!!";
    }
}
