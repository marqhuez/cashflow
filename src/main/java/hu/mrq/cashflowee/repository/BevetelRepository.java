package hu.mrq.cashflowee.repository;

import hu.mrq.cashflowee.entity.Bevetel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BevetelRepository extends JpaRepository<Bevetel, Long> {
}
