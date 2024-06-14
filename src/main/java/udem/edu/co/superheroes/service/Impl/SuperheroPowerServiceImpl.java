package udem.edu.co.superheroes.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import udem.edu.co.superheroes.entities.SuperheroPower;
import udem.edu.co.superheroes.repositorio.SuperheroPowerRepository;
import udem.edu.co.superheroes.service.SuperheroPowerService;

import java.util.List;
import java.util.Optional;

@Service
public class SuperheroPowerServiceImpl implements SuperheroPowerService {

    @Autowired
    private SuperheroPowerRepository superheroPowerRepository;

    @Override
    public List<SuperheroPower> findAllSuperheroPowers() {
        return superheroPowerRepository.findAll();
    }

    @Override
    public Optional<SuperheroPower> findByIdSuperheroPower(int id) {
        return superheroPowerRepository.findById(id);
    }

    @Override
    public SuperheroPower createSuperheroPower(SuperheroPower superheroPower) {
        return superheroPowerRepository.save(superheroPower);
    }

    @Override
    public SuperheroPower updateSuperheroPower(SuperheroPower superheroPower) {
        return superheroPowerRepository.save(superheroPower);
    }

    @Override
    public void deleteSuperheroPower(int id) {
        superheroPowerRepository.deleteById(id);
    }
}