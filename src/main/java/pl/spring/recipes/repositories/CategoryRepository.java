package pl.spring.recipes.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.spring.recipes.domain.Category;

import java.util.Optional;

/**
 * Created by A.Wójcik on 02.09.2019.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
