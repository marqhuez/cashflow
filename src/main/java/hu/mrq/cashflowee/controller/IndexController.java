package hu.mrq.cashflowee.controller;

import hu.mrq.cashflowee.entity.Bevetel;
import hu.mrq.cashflowee.entity.Kiadas;
import hu.mrq.cashflowee.service.BevetelService;
import hu.mrq.cashflowee.service.KiadasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    BevetelService bs;

    @Autowired
    KiadasService ks;

    @GetMapping("cashflow")
    public String viewIndex(Model model) {

        model.addAttribute("egyenleg", egyenlegSzamol());

        return "index";
    }

    public Integer egyenlegSzamol() {

        List<Bevetel> bevetelList = bs.getAll();
        List<Kiadas> kiadasList = ks.getAll();

        int osszesBevetel = 0;
        int osszesKiadas = 0;

        for (Bevetel bevetel : bevetelList) {
            osszesBevetel += bevetel.getOsszeg();
        }
        System.out.println(osszesBevetel);

        for (Kiadas kiadas : kiadasList) {
            osszesKiadas += kiadas.getOsszeg();
        }
        System.out.println(osszesKiadas);

        return osszesBevetel - osszesKiadas;

    }

}
