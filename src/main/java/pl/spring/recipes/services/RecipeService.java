package pl.spring.recipes.services;

import pl.spring.recipes.domain.Recipe;

import java.util.Set;

/**
 * Created by A.Wójcik on 03.09.2019.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
