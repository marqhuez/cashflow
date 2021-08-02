package hu.mrq.cashflowee.service;

import hu.mrq.cashflowee.entity.Kategoria;
import hu.mrq.cashflowee.repository.KategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KategoriaService {

    @Autowired
    KategoriaRepository kategoriaRepository;

    public List<Kategoria> getAll() {
        return kategoriaRepository.findAll();
    }

    public List<Kategoria> getAllKiadasSzulo() {
        return kategoriaRepository.findBySzuloKategoriaIdAndTipus(0, "kiadas");
    }

    public List<Kategoria> getBevetelKategoria() {
        return kategoriaRepository.findByTipus("bevetel");
    }

    public List<Kategoria> getKiadasKategoria() {
        return kategoriaRepository.findByTipus("kiadas");
    }

    public List<Kategoria> getBySzuloId(Integer szuloId) {
        return kategoriaRepository.findBySzuloKategoriaId(szuloId);
    }
}
