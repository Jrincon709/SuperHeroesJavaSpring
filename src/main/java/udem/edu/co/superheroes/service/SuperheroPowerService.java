package udem.edu.co.superheroes.service;

import udem.edu.co.superheroes.entities.SuperheroPower;

import java.util.List;
import java.util.Optional;

public interface SuperheroPowerService {
    List<SuperheroPower> findAllSuperheroPowers();
    Optional<SuperheroPower> findByIdSuperheroPower(int id);
    SuperheroPower createSuperheroPower(SuperheroPower superheroPower);
    SuperheroPower updateSuperheroPower(SuperheroPower superheroPower);
    void deleteSuperheroPower(int id);
}