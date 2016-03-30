package com.cube5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cube5.service.PlataformaService;

@Controller
@RequestMapping("/")
public class HomeController {
    
    @Autowired
    private PlataformaService plataformaService;
    
    @RequestMapping(method=RequestMethod.GET)
    public String home() {
        plataformaService.getPlataformas();
        return "index";
    }
}
