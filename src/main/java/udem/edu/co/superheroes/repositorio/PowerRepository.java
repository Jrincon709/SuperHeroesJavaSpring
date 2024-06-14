package udem.edu.co.superheroes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import udem.edu.co.superheroes.entities.Power;

public interface PowerRepository extends JpaRepository<Power, Integer> {
}
