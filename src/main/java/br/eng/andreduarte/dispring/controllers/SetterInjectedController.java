package br.eng.andreduarte.dispring.controllers;

import br.eng.andreduarte.dispring.services.GreetingService;

/**
 * Created by Andre on 9/8/17.
 */
public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

}
