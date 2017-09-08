package br.eng.andreduarte.dispring.services;

import org.springframework.stereotype.Service;

/**
 * Created by Andre on 9/8/17.
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_NERDS = "Hello Nerds!!!!";

    @Override
    public String sayGreeting() {
        return HELLO_NERDS;
    }

}
