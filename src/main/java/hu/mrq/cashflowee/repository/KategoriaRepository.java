package hu.mrq.cashflowee.repository;

import hu.mrq.cashflowee.entity.Kategoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KategoriaRepository extends JpaRepository<Kategoria, Long> {

    List<Kategoria> findByTipus(String tipus);

    List<Kategoria> findBySzuloKategoriaIdAndTipus(Integer szuloKategoriaId, String tipus);

    List<Kategoria> findBySzuloKategoriaId(Integer szuloId);
}
