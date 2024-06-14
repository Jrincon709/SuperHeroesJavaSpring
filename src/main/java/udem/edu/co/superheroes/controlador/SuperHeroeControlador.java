package udem.edu.co.superheroes.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import udem.edu.co.superheroes.entities.Superhero;
import udem.edu.co.superheroes.service.SuperHeroesService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/superheroes")
public class SuperHeroeControlador {

    @Autowired
    private SuperHeroesService superheroService;

    @GetMapping
    public List<Superhero> findAllSuperheroes() {
        return superheroService.findAllSuperheroes();
    }

    @GetMapping("/{idSuper}")
    public Optional<Superhero> findSuperheroById(@PathVariable int idSuper) {
        return superheroService.findByIdSuperhero(idSuper);
    }

    @PostMapping
    public Superhero createSuperhero(@RequestBody Superhero superhero) {
        return superheroService.createSuperhero(superhero);
    }

    @PutMapping("/{idSuper}")
    public Superhero updateSuperhero(@PathVariable int idSuper, @RequestBody Superhero superhero) {
        superhero.setId(idSuper);
        return superheroService.updateSuperhero(superhero);
    }

    @DeleteMapping("/{idSuper}")
    public void deleteSuperhero(@PathVariable int idSuper) {
        superheroService.deleteSuperhero(idSuper);
    }
}