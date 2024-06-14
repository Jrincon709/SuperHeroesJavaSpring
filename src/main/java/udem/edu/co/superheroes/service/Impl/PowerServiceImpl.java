package udem.edu.co.superheroes.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import udem.edu.co.superheroes.entities.Power;
import udem.edu.co.superheroes.repositorio.PowerRepository;
import udem.edu.co.superheroes.service.PowerService;

import java.util.List;
import java.util.Optional;

@Service
public class PowerServiceImpl implements PowerService {

    @Autowired
    private PowerRepository powerRepository;

    @Override
    public List<Power> findAllPowers() {
        return powerRepository.findAll();
    }

    @Override
    public Optional<Power> findByIdPower(int id) {
        return powerRepository.findById(id);
    }

    @Override
    public Power createPower(Power power) {
        return powerRepository.save(power);
    }

    @Override
    public Power updatePower(Power power) {
        return powerRepository.save(power);
    }

    @Override
    public void deletePower(int id) {
        powerRepository.deleteById(id);
    }
}