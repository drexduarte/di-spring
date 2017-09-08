package br.eng.andreduarte.dispring.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Andre on 9/8/17.
 */
@Service
@Profile({"en","default"})
@Primary
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - I'm the primary service!!";
    }
}
