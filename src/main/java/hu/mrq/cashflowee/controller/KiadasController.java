package hu.mrq.cashflowee.controller;

import hu.mrq.cashflowee.entity.Kiadas;
import hu.mrq.cashflowee.service.KiadasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class KiadasController {

    @Autowired
    private KiadasService ks;

    @GetMapping("cashflow/kiadas")
    public String viewKiadasok(Model model) {

        List<Kiadas> all = ks.getAll();

        model.addAttribute("kiadasok", ks.getAll());

        return "kiadas";
    }

}
