package hu.mrq.cashflowee.entity;

import javax.persistence.*;

@Entity
public class Alkategoria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nev;
    private Integer szuloKategoriaId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "szuloKategoriaId", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    private Kategoria kategoria = new Kategoria();

    public Alkategoria(Long id, String nev, Integer szuloKategoriaId) {
        this.id = id;
        this.nev = nev;
        this.szuloKategoriaId = szuloKategoriaId;
    }

    public Alkategoria() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public Integer getSzuloKategoriaId() {
        return szuloKategoriaId;
    }

    public void setSzuloKategoriaId(Integer szuloKategoriaId) {
        this.szuloKategoriaId = szuloKategoriaId;
    }

    public Kategoria getKategoria() {
        return kategoria;
    }

    public void setKategoria(Kategoria kategoria) {
        this.kategoria = kategoria;
    }
}
