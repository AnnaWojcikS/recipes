package pl.spring.recipes.repositories;


import org.springframework.data.repository.CrudRepository;
import pl.spring.recipes.domain.UnitOfMeasure;

import java.util.Optional;

/**
 * Created by A.Wójcik on 02.09.2019.
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
