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
    public String alkategoriaFeldolgoz(@RequestParam("type") String type, @RequestParam("szuloKategoriaId") String szuloKategoriaId) {

        String result = "";

        if (type.equals("kategoriaSelect")) {

            if (!szuloKategoriaId.equals("")) {
                List<Kategoria> all = kategoriaService.getBySzuloId(Integer.parseInt(szuloKategoriaId));

                if (all.size() != 0) {
                    String btnOnClick;

                    result += "<button data-id='-1' onclick='kategoriaBackButton()' type='button' class='btn btn-sm btn-primary m-1 kategoria-btn'><i " +
                            "class='fas " +
                            "fa-arrow-left'></i></button>";
                    for (Kategoria kategoria : all) {

                        if (kategoria.getIsSzulo()) {
                            btnOnClick = "onclick='getAlkategoria(" + kategoria.getId() + ", this)' ";
                        } else {
                            btnOnClick = "onclick='setKategoriaValue(" + kategoria.getId() + ")' ";
                        }

                        result +=
                                "<button data-id='"
                                        + kategoria.getId() + "' "
                                        + btnOnClick
                                        + "type='button' class='btn btn-sm btn-primary "
                                        + "m-1 kategoria-btn'>"
                                        + kategoria.getNev() +
                                "</button>";
                    }
                }

            }
        }

        if (type.equals("back")) {
            List<Kategoria> all = kategoriaService.getAllKiadasSzulo();
            String isSzulo;
            String btnOnClick;

            if (all.size() != 0) {
                for (Kategoria kategoria : all) {

                    if (kategoria.getIsSzulo()) {
                        btnOnClick = "onclick='getAlkategoria(" + kategoria.getId() + ", this)' ";
                    } else {
                        btnOnClick = "onclick='setKategoriaValue(" + kategoria.getId() + ")' ";
                    }

                    isSzulo = kategoria.getIsSzulo() ? "data-szulo='true'" : "";
                    result += "<button data-id='"
                                + kategoria.getId() + "' "
                                + isSzulo + " "
                                + btnOnClick
                                + " type='button' class='btn btn-sm btn-primary m-1 "
                                + "kategoria-btn'>" + kategoria.getNev()
                            + "</button>";
                }
            }
        }

        return result;
    }
}
