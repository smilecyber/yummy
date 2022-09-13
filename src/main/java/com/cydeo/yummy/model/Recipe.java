package com.cydeo.yummy.model;

import com.cydeo.yummy.enums.RecipeType;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class Recipe {
    private UUID id;
    private String name;
    private int duration;
    private String preparation;
    private RecipeType recipeType;
    private List<Ingredients> ingredientsList;
}
