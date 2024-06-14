package udem.edu.co.superheroes.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import udem.edu.co.superheroes.entities.Superhero;
import udem.edu.co.superheroes.repositorio.SuperheroRepository;
import udem.edu.co.superheroes.service.SuperHeroesService;

import java.util.List;
import java.util.Optional;

@Service
public class SuperHeroesServiceImpl implements SuperHeroesService {

    @Autowired
    private SuperheroRepository superheroRepository;

    public List<Superhero> findAllSuperheroes() {
        return superheroRepository.findAll();
    }

    public Optional<Superhero> findByIdSuperhero(int id) {
        return superheroRepository.findById(id);
    }

    public Superhero createSuperhero(Superhero superhero) {
        return superheroRepository.save(superhero);
    }

    public Superhero updateSuperhero(Superhero superhero) {
        return superheroRepository.save(superhero);
    }

    public void deleteSuperhero(int id) {
        superheroRepository.deleteById(id);
    }
}
