package pl.spring.recipes.services;

import org.springframework.stereotype.Service;
import pl.spring.recipes.domain.Recipe;
import pl.spring.recipes.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by A.Wójcik on 03.09.2019.
 */
@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
}
