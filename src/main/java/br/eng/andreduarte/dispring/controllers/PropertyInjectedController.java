package br.eng.andreduarte.dispring.controllers;

import br.eng.andreduarte.dispring.services.GreetingServiceImpl;

/**
 * Created by Andre on 9/8/17.
 */

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
