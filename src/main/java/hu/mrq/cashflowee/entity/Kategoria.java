package hu.mrq.cashflowee.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Kategoria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nev;
    private String tipus;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "kategoria")
    private Set<Bevetel> bevetel = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "kategoria")
    private Set<Kiadas> kiadas = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "kategoria")
    private Set<Alkategoria> alkategoria = new HashSet<>();

    public Kategoria(Long id, String nev) {
        this.id = id;
        this.nev = nev;
    }

    public Kategoria() {}

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

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }
}
