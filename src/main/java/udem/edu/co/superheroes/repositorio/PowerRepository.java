package udem.edu.co.superheroes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import udem.edu.co.superheroes.entities.Power;

import java.util.List;

public interface PowerRepository extends JpaRepository<Power, Integer> {

    @Query("SELECT p.name, s.name FROM Power p JOIN p.superheroPowers sp JOIN sp.superhero s WHERE p.id = :powerId")
    List<Object[]> findSuperheroesByPowerId(@Param("powerId") int powerId);
}
