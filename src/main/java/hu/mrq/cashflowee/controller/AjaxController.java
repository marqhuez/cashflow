package hu.mrq.cashflowee.controller;

import hu.mrq.cashflowee.entity.Kategoria;
import hu.mrq.cashflowee.service.KategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AjaxController {

    @Autowired
    KategoriaService kategoriaService;

    @PostMapping(value = "cashflow/alkategoriafeldolgoz")
    @ResponseBody
    public String alkategoriaFeldolgoz(@RequestParam("szuloKategoriaId") String szuloKategoriaId) {

        String result = "";
        
        if (!szuloKategoriaId.equals("")) {
            List<Kategoria> all = kategoriaService.getBySzuloId(Integer.parseInt(szuloKategoriaId));

            if (all.size() != 0) {
                for (Kategoria kategoria : all) {
                    result += "<button onclick='setKategoriaValue(" + kategoria.getId() + ", this)' type='button' class='btn btn-sm btn-primary m-1 kategoria-btn'>" + kategoria.getNev() + "</button>";
                }
            }
        }

        return result;
    }

}
