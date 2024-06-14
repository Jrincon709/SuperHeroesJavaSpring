package udem.edu.co.superheroes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import udem.edu.co.superheroes.entities.Power;
import udem.edu.co.superheroes.entities.Superhero;

import java.util.List;

public interface SuperheroRepository extends JpaRepository<Superhero, Integer> {
    // Método para contar cuántos poderes tiene cada superhéroe
    @Query("SELECT s.name, COUNT(sp.power) FROM Superhero s JOIN s.superheroPowers sp GROUP BY s.name")
    List<Object[]> countPowersBySuperhero();

    // Método para encontrar todos los poderes de un superhéroe específico
    @Query("SELECT p FROM Superhero s JOIN s.superheroPowers sp JOIN sp.power p WHERE s.idSuper = :superheroId")
    List<Power> findPowersBySuperheroId(@Param("superheroId") int superheroId);

}

