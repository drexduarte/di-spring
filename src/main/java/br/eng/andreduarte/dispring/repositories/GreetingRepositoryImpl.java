package br.eng.andreduarte.dispring.repositories;

import org.springframework.stereotype.Component;

/**
 * Created by Andre on 9/8/17.
 */
@Component
public class GreetingRepositoryImpl implements  GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello - I'm the primary service!!";
    }

    @Override
    public String getPortugueseGreeting() {
        return "Olá - Eu sou o serviço primário!!";
    }

    @Override
    public String getItalianGreeting() {
        return "Ciao - Sono il servizio primario!!";
    }
}
