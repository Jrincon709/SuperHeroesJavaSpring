package udem.edu.co.superheroes.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="SUPERHERO_POWER")
public class SuperheroPower {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "superhero_id")
    private Superhero superhero;

    @ManyToOne
    @JoinColumn(name = "power_id")
    private Power power;

    private LocalDate acquisitionDate;
    private String status;
    private int powerLevel;

}
