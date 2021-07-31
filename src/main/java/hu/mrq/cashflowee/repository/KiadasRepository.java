package hu.mrq.cashflowee.repository;

import hu.mrq.cashflowee.entity.Kiadas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KiadasRepository extends JpaRepository<Kiadas, Long> {

    @Query(value = "SELECT osszeg FROM kiadas", nativeQuery = true)
    List<Integer> findOsszeg();

}
