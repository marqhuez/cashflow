package hu.mrq.cashflowee.repository;

import hu.mrq.cashflowee.entity.Szamla;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SzamlaRepository extends JpaRepository<Szamla, Long> {
}
