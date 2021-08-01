package hu.mrq.cashflowee.controller;

import hu.mrq.cashflowee.entity.Alkategoria;
import hu.mrq.cashflowee.entity.AlkategoriaResponse;
import hu.mrq.cashflowee.service.AlkategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AjaxController {

    @Autowired
    AlkategoriaService alkategoriaService;

    @PostMapping(value = "cashflow/alkategoriafeldolgoz")
    @ResponseBody
    public String alkategoriaFeldolgoz(@RequestParam("szuloKategoriaId") String szuloKategoriaId) {

        List<Alkategoria> all = alkategoriaService.getBySzuloId(Integer.parseInt(szuloKategoriaId));
        String result = "";

        if (all.size() != 0) {
            result = "<label id='alkategoriaSelectorLabel' for='alkategoriaSelector'>Alkategória</label><select class='form-control mb-3' id='alkategoriaSelector'>";

            for (Alkategoria alkategoria : all) {
                System.out.println(alkategoria.getNev());
                result += "<option value='" + alkategoria.getId() + "'>" + alkategoria.getNev() + "</option>";
            }

            result += "</select>";
        }

        return result;
    }

}
