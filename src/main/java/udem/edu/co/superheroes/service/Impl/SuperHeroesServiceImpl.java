package udem.edu.co.superheroes.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import udem.edu.co.superheroes.entities.Power;
import udem.edu.co.superheroes.entities.Superhero;
import udem.edu.co.superheroes.repositorio.SuperheroRepository;
import udem.edu.co.superheroes.service.SuperHeroesService;

import java.util.List;
import java.util.Optional;

@Service
public class SuperHeroesServiceImpl implements SuperHeroesService {

    @Autowired
    private SuperheroRepository superheroRepository;

    @Override
    public List<Superhero> findAllSuperheroes() {
        return superheroRepository.findAll();
    }

    @Override
    public Optional<Superhero> findByIdSuperhero(int id) {
        return superheroRepository.findById(id);
    }

    @Override
    public Superhero createSuperhero(Superhero superhero) {
        return superheroRepository.save(superhero);
    }

    @Override
    public Superhero updateSuperhero(Superhero superhero) {
        return superheroRepository.save(superhero);
    }

    @Override
    public void deleteSuperhero(int id) {
        superheroRepository.deleteById(id);
    }

    @Override
    public List<Object[]> countPowersBySuperhero() {
        return superheroRepository.countPowersBySuperhero();
    }

    @Override
    public List<Power> findPowersBySuperheroId(int superheroId) {
        return superheroRepository.findPowersBySuperheroId(superheroId);
    }
}
