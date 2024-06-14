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
@Table(name = "SUPERHERO")
public class Superhero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSuper;
    private String name;
    private String nickName;
    private int age;
    private String description;
    private String suitColor;
    private String photoSuper;

    @OneToMany(mappedBy = "superhero", cascade = CascadeType.ALL)
    private List<SuperheroPower> superheroPowers;

    public int getIdSuper() {
        return idSuper;
    }

    public void setIdSuper(int idSuper) {
        this.idSuper = idSuper;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSuitColor() {
        return suitColor;
    }

    public void setSuitColor(String suitColor) {
        this.suitColor = suitColor;
    }

    public String getPhotoSuper() {
        return photoSuper;
    }

    public void setPhotoSuper(String photoSuper) {
        this.photoSuper = photoSuper;
    }

    public List<SuperheroPower> getSuperheroPowers() {
        return superheroPowers;
    }

    public void setSuperheroPowers(List<SuperheroPower> superheroPowers) {
        this.superheroPowers = superheroPowers;
    }

}

