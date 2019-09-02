package pl.spring.recipes.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.spring.recipes.domain.Recipe;

/**
 * Created by A.Wójcik on 02.09.2019.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
