package com.siempreprogramando.proyectoweb.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author luis
 */
@Controller
@Scope("request")
public class InicioController {
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String inicio() {
        return "inicio";
    }
    
}
