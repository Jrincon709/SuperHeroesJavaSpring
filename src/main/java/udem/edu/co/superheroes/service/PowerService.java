package udem.edu.co.superheroes.service;

import udem.edu.co.superheroes.entities.Power;

import java.util.List;
import java.util.Optional;

public interface PowerService {
    List<Power> findAllPowers();
    Optional<Power> findByIdPower(int id);
    Power createPower(Power power);
    Power updatePower(Power power);
    void deletePower(int id);
    List<Object[]> findSuperheroesByPowerId(int id);
}