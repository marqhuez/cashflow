package hu.mrq.cashflowee.service;

import hu.mrq.cashflowee.entity.Kiadas;
import hu.mrq.cashflowee.repository.KiadasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KiadasService {

    @Autowired
    private KiadasRepository kr;

    public List<Kiadas> getAll() {
        return kr.findAll();
    }

    public List<Integer> getOsszeg() {
        return kr.findOsszeg();
    }

    public void saveKiadas(Kiadas kiadas) {
        kr.save(kiadas);
    }
}
