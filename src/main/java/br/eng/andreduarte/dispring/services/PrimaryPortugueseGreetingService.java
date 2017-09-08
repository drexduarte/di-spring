package br.eng.andreduarte.dispring.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Andre on 9/8/17.
 */
@Service
@Profile("pt")
@Primary
public class PrimaryPortugueseGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Olá - Eu sou o serviço primário!!";
    }
}
