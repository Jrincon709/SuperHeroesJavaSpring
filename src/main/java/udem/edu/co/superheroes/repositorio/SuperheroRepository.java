package udem.edu.co.superheroes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import udem.edu.co.superheroes.entities.Superhero;

public interface SuperheroRepository extends JpaRepository<Superhero, Integer> {
}

