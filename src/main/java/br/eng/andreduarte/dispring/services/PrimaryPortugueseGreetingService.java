package br.eng.andreduarte.dispring.services;

import br.eng.andreduarte.dispring.repositories.GreetingRepository;
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

    GreetingRepository greetingRepository;

    public PrimaryPortugueseGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getPortugueseGreeting();
    }
}
