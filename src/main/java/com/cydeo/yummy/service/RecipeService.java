package com.cydeo.yummy.service;

import com.cydeo.yummy.model.Recipe;

public interface RecipeService {
    boolean prepareRecipe();

    boolean shareRecipe(Recipe recipe);
}
