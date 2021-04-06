package guru.springframework.domain;

import javax.persistence.*;

@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipies recipies;
    @Lob
    private String recpieNotes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recipies getRecipies() {
        return recipies;
    }

    public void setRecipies(Recipies recipies) {
        this.recipies = recipies;
    }

    public String getRecpieNotes() {
        return recpieNotes;
    }

    public void setRecpieNotes(String recpieNotes) {
        this.recpieNotes = recpieNotes;
    }
}
