package hu.mrq.cashflowee.service;

import hu.mrq.cashflowee.entity.Szamla;
import hu.mrq.cashflowee.repository.SzamlaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SzamlaService {

    @Autowired
    SzamlaRepository szr;

    public List<Szamla> getAll() {
        return szr.findAll();
    }
}
