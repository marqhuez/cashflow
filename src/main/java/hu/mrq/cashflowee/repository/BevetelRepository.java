package hu.mrq.cashflowee.repository;

import hu.mrq.cashflowee.entity.Bevetel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BevetelRepository extends JpaRepository<Bevetel, Long> {

    @Query(value = "SELECT osszeg FROM bevetel", nativeQuery = true)
    List<Integer> findOsszeg();

}
