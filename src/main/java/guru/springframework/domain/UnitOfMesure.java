package guru.springframework.domain;

import javax.persistence.*;

@Entity
public class UnitOfMesure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;


    private String disc;

    @OneToOne
    private Ingredient ingredient;
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getdisc() {
        return disc;
    }

    public void setdisc(String disc) {
        this.disc = disc;
    }
}
