package br.eng.andreduarte.dispring.controllers;

import br.eng.andreduarte.dispring.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by Andre on 9/8/17.
 */
@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    @Autowired

    public void setGreetingService(@Qualifier("setterGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

}
