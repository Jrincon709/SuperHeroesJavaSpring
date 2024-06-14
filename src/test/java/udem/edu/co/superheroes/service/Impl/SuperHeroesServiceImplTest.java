package udem.edu.co.superheroes.service.Impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import udem.edu.co.superheroes.entities.Superhero;
import udem.edu.co.superheroes.repositorio.SuperheroRepository;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class SuperHeroesServiceImplTest {

    @Mock
    private SuperheroRepository superHeroesRepository;

    @InjectMocks
    private SuperHeroesServiceImpl superHeroesService;


    @BeforeEach
    void setUp() {
        Superhero superHeroes = new Superhero();
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void findByIdSuperHeroesTest() {
        Superhero superHeroes1 = new Superhero();
        superHeroes1.setIdSuper(1);

        when(superHeroesRepository.findById(1)).thenReturn(Optional.of(superHeroes1));

        Optional<Superhero> result = superHeroesService.findByIdSuperhero(1);
        assertEquals(superHeroes1, result.get());

        verify(superHeroesRepository, times(1)).findById(1);
    }

    @Test
    void findAllSuperHeroesTest() {
        Superhero superHeroes1 = new Superhero();
        Superhero superHeroes2 = new Superhero();
        List<Superhero> superHeroesList = Arrays.asList(superHeroes1, superHeroes2);
        when(superHeroesRepository.findAll()).thenReturn(superHeroesList);
        List<Superhero> result = superHeroesService.findAllSuperheroes();
        assertEquals(superHeroesList, result);

        verify(superHeroesRepository, times(1)).findAll();
    }

    @Test
    void createSuperHeroesTest() {
        Superhero superHeroes1 = new Superhero();
        superHeroes1.setIdSuper(1);
        superHeroes1.setName("batman");

        when(superHeroesRepository.save(any(Superhero.class))).thenReturn(superHeroes1);
        Superhero result = superHeroesService.createSuperhero(superHeroes1);
        assertEquals(superHeroes1, result);

        verify(superHeroesRepository, times(1)).save(any(Superhero.class));
    }
    @Test
    void updateSuperHeroesTest(){
        Superhero superHeroes1 = new Superhero();
        superHeroes1.setIdSuper(1);
        superHeroes1.setName("Batman");

        when(superHeroesRepository.save(any(Superhero.class))).thenReturn(superHeroes1);

        Superhero result = superHeroesService.updateSuperhero(superHeroes1);

        assertEquals(superHeroes1, result);

        verify(superHeroesRepository, times(1)).save(any(Superhero.class));
    }
}
