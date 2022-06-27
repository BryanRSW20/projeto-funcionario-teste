package br.senai.controller;

import br.senai.model.Agenda;
import br.senai.model.Projeto;
import br.senai.repository.AgendaRepository;
import br.senai.service.AgendaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AgendaController {

    @Autowired
    AgendaServiceImpl agendaService;



    @GetMapping("/agenda/list")
    public String findAll(Model model){
        model.addAttribute("agendas", agendaService.findAll());
        return "agenda/list";
    }

    @GetMapping("/agenda/add")
    public String add(Model model){
        model.addAttribute("agenda", new Agenda());
        model.addAttribute("agenda", agendaService.findAll());
        return "agenda/add";
    }

    @GetMapping("/agenda/edit/{id}")
    public String edit(Model model, @PathVariable Long id){
        model.addAttribute("agenda", agendaService.findById(id));
        return "agenda/edit";
    }

    @PostMapping("/agenda/save")
    public String save(Agenda agenda, Model model){
        try{
            agendaService.save(agenda);
            model.addAttribute("agenda", agenda);
            model.addAttribute("isSaved", true);
            return "agenda/add";
        } catch (Exception e){
            model.addAttribute("agenda", agenda);
            model.addAttribute("agendas", agendaService.findAll());
            model.addAttribute("isError", true);
            model.addAttribute("error", e.getMessage());
            return "agenda/add";
        }
    }

}
