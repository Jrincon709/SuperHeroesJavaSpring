package udem.edu.co.superheroes.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "POWER")
public class Power {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPower;
    private String name;
    private String description;

    @OneToMany(mappedBy = "power", cascade = CascadeType.ALL)
    private List<SuperheroPower> superheroPowers;

    public int getIdPower() {
        return idPower;
    }

    public void setIdPower(int idPower) {
        this.idPower = idPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<SuperheroPower> getSuperheroPowers() {
        return superheroPowers;
    }

    public void setSuperheroPowers(List<SuperheroPower> superheroPowers) {
        this.superheroPowers = superheroPowers;
    }
}
