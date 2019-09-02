package pl.spring.recipes.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.spring.recipes.domain.Category;

/**
 * Created by A.Wójcik on 02.09.2019.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
