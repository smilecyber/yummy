package com.cydeo.yummy.service;

import com.cydeo.yummy.model.Recipe;

public interface RecipeRepository {
    boolean save(Recipe recipe);
}
