package udem.edu.co.superheroes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import udem.edu.co.superheroes.entities.SuperheroPower;

public interface SuperheroPowerRepository extends JpaRepository<SuperheroPower, Integer> {
}