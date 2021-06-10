package com.example.sogne.controllers;

import com.example.sogne.model.Sogne;
import com.example.sogne.repository.SogneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
@Autowired
SogneRepository sogneRepository;

    @GetMapping("/")
    public String index(Model model){
        Iterable<Sogne> sogneSet;
        sogneSet=sogneRepository.findAll();
        model.addAttribute("sogneSet",sogneSet);
        return "index";
    }
}
