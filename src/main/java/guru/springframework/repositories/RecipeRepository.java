package guru.springframework.repositories;

import guru.springframework.domain.Recipies;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipies,Long> {
}
