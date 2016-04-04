package com.cube5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cube5.model.Plataforma;
import com.cube5.service.PlataformaService;

@Controller
@RequestMapping("/")
public class HomeController {
    
    @Autowired
    private PlataformaService plataformaService;
    
    @RequestMapping(method=RequestMethod.GET)
    public String home(Model model) {
        List<Plataforma> plataformas = plataformaService.getPlataformas();
        model.addAttribute("plataformas", plataformas);
        return "index";
    }
}