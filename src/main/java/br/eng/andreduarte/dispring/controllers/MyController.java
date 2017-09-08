package br.eng.andreduarte.dispring.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by Andre on 9/8/17.
 */
@Controller
public class MyController {

    public String hello(){
        System.out.println("Hello!!!");

        return "foo";
    }
}
