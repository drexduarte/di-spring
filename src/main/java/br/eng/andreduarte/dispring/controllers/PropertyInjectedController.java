package br.eng.andreduarte.dispring.controllers;

import br.eng.andreduarte.dispring.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Andre on 9/8/17.
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingServiceImpl;

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }
}
