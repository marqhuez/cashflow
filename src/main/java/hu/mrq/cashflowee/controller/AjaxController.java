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

        List<Kategoria> all = kategoriaService.getBySzuloId(Integer.parseInt(szuloKategoriaId));
        String result = "";

        if (all.size() != 0) {
            result = "<label id='alkategoriaSelectorLabel' for='alkategoriaSelector'>Alkategória</label><select class='form-control mb-3' id='alkategoriaSelector'>";

            for (Kategoria kategoria : all) {
                System.out.println(kategoria.getNev());
                result += "<option value='" + kategoria.getId() + "'>" + kategoria.getNev() + "</option>";
            }

            result += "</select>";
        }

        return result;
    }

}
