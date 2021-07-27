package hu.mrq.cashflowee.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Szamla {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nev;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "szamla")
    private Set<Bevetel> bevetel = new HashSet<>();

    public Szamla(Long id, String nev) {
        this.id = id;
        this.nev = nev;
    }

    public Szamla() {}

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
}
