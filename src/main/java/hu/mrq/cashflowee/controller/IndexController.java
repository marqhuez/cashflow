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

    public long egyenlegSzamol() {

        List<Integer> bevetelOsszegList = bs.getOsszeg();
        List<Integer> kiadasOsszegList = ks.getOsszeg();

        long osszesBevetel = 0;
        long osszesKiadas = 0;

        osszesBevetel = bevetelOsszegList.stream().mapToLong(Integer::longValue).sum();
        osszesKiadas = kiadasOsszegList.stream().mapToLong(Integer::longValue).sum();

        return osszesBevetel - osszesKiadas;

    }

}
