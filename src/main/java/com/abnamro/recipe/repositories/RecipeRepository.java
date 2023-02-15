package com.abnamro.recipe.repositories;

import com.abnamro.recipe.model.persistence.Ingredient;
import com.abnamro.recipe.model.persistence.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Integer>, JpaSpecificationExecutor<Recipe> {

    Recipe findByNameEqualsIgnoreCase(String name);
}