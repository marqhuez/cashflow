package hu.mrq.cashflowee.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Kiadas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer osszeg;
    private String megjegyzes;
    private Integer kategoriaId;
    private Integer szamlaId;
    @Temporal(TemporalType.TIMESTAMP)
    private Date idopont;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "kategoriaId", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    private Kategoria kategoria;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "szamlaId", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    private Szamla szamla;

    public Kiadas(Long id, Integer osszeg, String megjegyzes, Integer kategoriaId, Integer szamlaId, Date idopont) {
        this.id = id;
        this.osszeg = osszeg;
        this.megjegyzes = megjegyzes;
        this.kategoriaId = kategoriaId;
        this.szamlaId = szamlaId;
        this.idopont = idopont;
    }

    public Kiadas() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOsszeg() {
        return osszeg;
    }

    public void setOsszeg(Integer osszeg) {
        this.osszeg = osszeg;
    }

    public String getMegjegyzes() {
        return megjegyzes;
    }

    public void setMegjegyzes(String megjegyzes) {
        this.megjegyzes = megjegyzes;
    }

    public Integer getKategoriaId() {
        return kategoriaId;
    }

    public void setKategoriaId(Integer kategoriaId) {
        this.kategoriaId = kategoriaId;
    }

    public Integer getSzamlaId() {
        return szamlaId;
    }

    public void setSzamlaId(Integer szamlaId) {
        this.szamlaId = szamlaId;
    }

    public Date getIdopont() {
        return idopont;
    }

    public void setIdopont(Date idopont) {
        this.idopont = idopont;
    }

    public Kategoria getKategoria() {
        return kategoria;
    }

    public void setKategoria(Kategoria kategoria) {
        this.kategoria = kategoria;
    }

    public Szamla getSzamla() {
        return szamla;
    }

    public void setSzamla(Szamla szamla) {
        this.szamla = szamla;
    }
}
