package hu.mrq.cashflowee.repository;

import hu.mrq.cashflowee.entity.Kiadas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KiadasRepository extends JpaRepository<Kiadas, Long> {
}
