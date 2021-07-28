package hu.mrq.cashflowee.controller;

import hu.mrq.cashflowee.entity.Bevetel;
import hu.mrq.cashflowee.service.BevetelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BevetelController {

    @Autowired
    private BevetelService bc;

    @GetMapping("cashflow/bevetel")
    public String viewBevetelek(Model model) {

        List<Bevetel> all = bc.getAll();

        model.addAttribute("bevetelek", bc.getAll());

        return "bevetel";
    }

}
