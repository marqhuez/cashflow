package hu.mrq.cashflowee.controller;

import hu.mrq.cashflowee.entity.Bevetel;
import hu.mrq.cashflowee.entity.Kategoria;
import hu.mrq.cashflowee.entity.Szamla;
import hu.mrq.cashflowee.service.BevetelService;
import hu.mrq.cashflowee.service.KategoriaService;
import hu.mrq.cashflowee.service.SzamlaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UjBevetelController {

    @Autowired
    BevetelService bs;

    @Autowired
    KategoriaService kategoriaService;

    @Autowired
    SzamlaService szamlaService;

    @GetMapping("cashflow/ujbevetel")
    public String viewUjBevetel(Model model) {

        List<Kategoria> allKategoriak = kategoriaService.getBevetelKategoria();
        List<Szamla> allSzamlak = szamlaService.getAll();

        model.addAttribute("kategoriak", allKategoriak);
        model.addAttribute("szamlak", allSzamlak);

        return "ujbevetel";
    }

    @PostMapping("cashflow/ujbevetel")
    public String saveUjBevetel(Bevetel bevetel) {

        bs.saveBevetel(bevetel);

        return "redirect:/cashflow";
    }

}
