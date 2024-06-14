package udem.edu.co.superheroes.service;

import udem.edu.co.superheroes.entities.Power;
import udem.edu.co.superheroes.entities.Superhero;

import java.util.List;
import java.util.Optional;

public interface SuperHeroesService {
    List<Superhero> findAllSuperheroes();
    Optional<Superhero> findByIdSuperhero(int id);
    Superhero createSuperhero(Superhero superhero);
    Superhero updateSuperhero(Superhero superhero);
    void deleteSuperhero(int id);

    List<Power> findPowersBySuperheroId(int superheroId);
    List<Object[]> countPowersBySuperhero();
}