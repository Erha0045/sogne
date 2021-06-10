package com.example.sogne.controllers;

import com.example.sogne.repository.SogneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class HomeController {


    @GetMapping("/")
    public String index(Model model){
        return "index";
    }
}
