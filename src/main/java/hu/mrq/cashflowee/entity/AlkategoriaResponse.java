package hu.mrq.cashflowee.entity;

import java.util.List;

public class AlkategoriaResponse {

    public List<Alkategoria> alkategoriaList;

    public AlkategoriaResponse(List<Alkategoria> alkategoriaList) {
        this.alkategoriaList = alkategoriaList;
    }

    public List<Alkategoria> getAlkategoriaList() {
        return alkategoriaList;
    }

    public void setAlkategoriaList(List<Alkategoria> alkategoriaList) {
        this.alkategoriaList = alkategoriaList;
    }
}
