package hu.mrq.cashflowee.service;

import hu.mrq.cashflowee.entity.Bevetel;
import hu.mrq.cashflowee.repository.BevetelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BevetelService {

    @Autowired
    private BevetelRepository br;

    public List<Bevetel> getAll() {
        return br.findAll();
    }

    public void saveBevetel(Bevetel bevetel) {
        br.save(bevetel);
    }

}
