package udem.edu.co.superheroes.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import udem.edu.co.superheroes.entities.SuperheroPower;
import udem.edu.co.superheroes.service.SuperheroPowerService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/superhero-powers")
public class SuperheroPowerControlador {

    @Autowired
    private SuperheroPowerService superheroPowerService;

    @GetMapping
    public List<SuperheroPower> findAllSuperheroPowers() {
        return superheroPowerService.findAllSuperheroPowers();
    }

    @GetMapping("/{id}")
    public Optional<SuperheroPower> findSuperheroPowerById(@PathVariable int id) {
        return superheroPowerService.findByIdSuperheroPower(id);
    }

    @PostMapping
    public SuperheroPower createSuperheroPower(@RequestBody SuperheroPower superheroPower) {
        return superheroPowerService.createSuperheroPower(superheroPower);
    }

    @PutMapping("/{id}")
    public SuperheroPower updateSuperheroPower(@PathVariable int id, @RequestBody SuperheroPower superheroPower) {
        superheroPower.setId(id);
        return superheroPowerService.updateSuperheroPower(superheroPower);
    }

    @DeleteMapping("/{id}")
    public void deleteSuperheroPower(@PathVariable int id) {
        superheroPowerService.deleteSuperheroPower(id);
    }
}