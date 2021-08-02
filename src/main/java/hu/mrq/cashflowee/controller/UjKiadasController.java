package hu.mrq.cashflowee.controller;

import hu.mrq.cashflowee.entity.Kategoria;
import hu.mrq.cashflowee.entity.Kiadas;
import hu.mrq.cashflowee.entity.Szamla;
import hu.mrq.cashflowee.service.KategoriaService;
import hu.mrq.cashflowee.service.KiadasService;
import hu.mrq.cashflowee.service.SzamlaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UjKiadasController {

    @Autowired
    KiadasService kiadasService;

    @Autowired
    KategoriaService kategoriaService;

    @Autowired
    SzamlaService szamlaService;

    @GetMapping("cashflow/ujkiadas")
    public String viewUjKiadas(Model model) {

        List<Kategoria> allKategoriak = kategoriaService.getAllKiadasSzulo();
        List<Szamla> allSzamlak = szamlaService.getAll();

        model.addAttribute("kategoriak", allKategoriak);
        model.addAttribute("szamlak", allSzamlak);

        return "ujkiadas";
    }

    @PostMapping("cashflow/ujkiadas")
    public String saveUjKiadas(Kiadas kiadas) {

        kiadasService.saveKiadas(kiadas);

        return "redirect:/cashflow";
    }

}
