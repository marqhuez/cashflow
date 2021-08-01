package hu.mrq.cashflowee.service;

import hu.mrq.cashflowee.entity.Alkategoria;
import hu.mrq.cashflowee.repository.AlkategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlkategoriaService {

    @Autowired
    private AlkategoriaRepository alkategoriaRepository;

    public List<Alkategoria> getAll() {

        return alkategoriaRepository.findAll();

    }

    public List<Alkategoria> getBySzuloId(Integer szuloId) {
        return alkategoriaRepository.findBySzuloKategoriaId(szuloId);
    }

}
