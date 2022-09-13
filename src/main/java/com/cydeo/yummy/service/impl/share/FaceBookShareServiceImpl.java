package com.cydeo.yummy.service.impl.share;

import com.cydeo.yummy.model.Recipe;
import com.cydeo.yummy.service.ShareService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FaceBookShareServiceImpl implements ShareService {
    @Override
    public boolean share(Recipe recipe) {
        System.out.println("Shared on instagram");
        System.out.println("Recipe Name " + recipe.getName() );
        System.out.println("Ingredient List ");
        recipe.getIngredientsList().forEach(ingredients -> {
            System.out.println("    Ingredient Name " + ingredients.getName() + " Quantity : " + ingredients.getQuantity());
        });
        return true;
    }
}
