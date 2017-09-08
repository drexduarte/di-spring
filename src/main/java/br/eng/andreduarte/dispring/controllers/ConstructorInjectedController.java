package br.eng.andreduarte.dispring.controllers;

import br.eng.andreduarte.dispring.services.GreetingService;

/**
 * Created by Andre on 9/8/17.
 */
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
