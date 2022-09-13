package com.cydeo.yummy.service.impl;

import com.cydeo.yummy.model.Recipe;
import com.cydeo.yummy.service.RecipeRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RecipeRepositoryImpl implements RecipeRepository {
    public static List<Recipe> recipeList = new ArrayList<>();
    @Override
    public boolean save(Recipe recipe) {
        System.out.println("added to list");
        recipeList.add(recipe);
        return false;
    }
}
