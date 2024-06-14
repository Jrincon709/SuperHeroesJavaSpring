package udem.edu.co.superheroes.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import udem.edu.co.superheroes.entities.Power;
import udem.edu.co.superheroes.service.PowerService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/powers")
public class PowerControlador {

    @Autowired
    private PowerService powerService;

    @GetMapping
    public List<Power> findAllPowers() {
        return powerService.findAllPowers();
    }

    @GetMapping("/{idPower}")
    public Optional<Power> findPowerById(@PathVariable int idPower) {
        return powerService.findByIdPower(idPower);
    }

    @PostMapping
    public Power createPower(@RequestBody Power power) {
        return powerService.createPower(power);
    }

    @PutMapping("/{idPower}")
    public Power updatePower(@PathVariable int idPower, @RequestBody Power power) {
        power.setId(idPower);
        return powerService.updatePower(power);
    }

    @DeleteMapping("/{idPower}")
    public void deletePower(@PathVariable int idPower) {
        powerService.deletePower(idPower);
    }
}
