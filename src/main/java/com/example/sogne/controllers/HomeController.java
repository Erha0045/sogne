package com.example.sogne.controllers;

import com.example.sogne.model.Kommune;
import com.example.sogne.model.Sogne;
import com.example.sogne.repository.SogneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

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

    @GetMapping("/createSogn")
    public String createSogn(){
        return "/createSogn";
    }



    @PostMapping("/create")
    public String createNewProject(
            @RequestParam("sognekode") int sognekode,
            @RequestParam("navn") String navn,
            @RequestParam("smittetryk") double smittetryk,

            @RequestParam("nedlukningStart") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date nedlukningStart,
            @RequestParam("kommune")Kommune kommune){
        Sogne sogne = new Sogne(sognekode, navn, smittetryk, nedlukningStart,kommune );
        sogneRepository.save(sogne);
        return "redirect:/";

    }

    @GetMapping("/delete")
    public String delete(){
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam("id")int id) {
        sogneRepository.deleteById(id);
        return  "redirect:/";
    }

//    @GetMapping("/update/{id}")
//    public String update(@PathVariable("id") int id, Model modelMods, Model modelBrands){
//        modelMods.addAttribute("sogne", sogneRepository.findById(id));
//        //add brands to choose from
//        modelBrands.addAttribute("brands", brandService.findAll());
//        return "update";
//    }
//
//    @PostMapping("/update")
//    public String update(@ModelAttribute Mod mod){
//        //update by using update service
//        modService.update(mod);
//        return "redirect:/mods";
//    }
}
