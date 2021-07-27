package hu.mrq.cashflowee.repository;

import hu.mrq.cashflowee.entity.Kategoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface KategoriaRepository extends JpaRepository<Kategoria, Long> {
}
