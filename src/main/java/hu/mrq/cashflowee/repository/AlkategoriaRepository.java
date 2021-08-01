package hu.mrq.cashflowee.repository;

import hu.mrq.cashflowee.entity.Alkategoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlkategoriaRepository extends JpaRepository<Alkategoria, Long> {
    List<Alkategoria> findBySzuloKategoriaId(Integer szuloKategoriaId);
}
