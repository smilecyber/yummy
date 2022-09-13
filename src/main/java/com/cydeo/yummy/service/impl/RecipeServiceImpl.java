package com.cydeo.yummy.service.impl;

import com.cydeo.yummy.enums.QuantityType;
import com.cydeo.yummy.enums.RecipeType;
import com.cydeo.yummy.model.Ingredients;
import com.cydeo.yummy.model.Recipe;
import com.cydeo.yummy.service.RecipeRepository;
import com.cydeo.yummy.service.RecipeService;
import com.cydeo.yummy.service.ShareService;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;
    private final ShareService shareService;
    private final Faker faker;

    public RecipeServiceImpl(RecipeRepository recipeRepository,
                             ShareService shareService,
                             Faker faker) {
        this.recipeRepository = recipeRepository;
        this.shareService = shareService;
        this.faker = faker;
    }

    @Override
    public boolean prepareRecipe() {
        for (int i = 0; i<=20; i++){
            Arrays.stream(RecipeType.values()).forEach(recipeType -> {
                Recipe recipe = new Recipe();
                recipe.setRecipeType(recipeType);
                recipe.setName(faker.food().dish());
                recipe.setPreparation(recipeType.name() + "preparation");
                recipe.setDuration(generateRandomValue());
                recipe.setIngredientsList(prepareIngredientList(QuantityType.LB));
                recipe.setId(UUID.randomUUID());
                recipeRepository.save(recipe);
                shareService.share(recipe);
            });
        }
        return true;
    }

    private List<Ingredients> prepareIngredientList(QuantityType quantityType){
        List<Ingredients> ingredientsList = new ArrayList<>();
        int randomized = generateRandomValue();
        for (int i=0; i<randomized; i++){
            Ingredients ingredients = new Ingredients();
            ingredients.setName(faker.food().ingredient());
            ingredients.setQuantityType(quantityType);
            ingredients.setQuantity(randomized);
            ingredientsList.add(ingredients);
        }
        return ingredientsList;
    }

    private int generateRandomValue(){
        Random random = new Random();
        return random.nextInt(20);
    }

    @Override
    public boolean shareRecipe(Recipe recipe) {
        return shareService.share(recipe);
    }
}
