package com.cydeo.yummy;

import com.cydeo.yummy.service.RecipeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class YummyApplication {
    private final RecipeService recipeService;

    public YummyApplication(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    public static void main(String[] args) {
        SpringApplication.run(YummyApplication.class, args);
    }

    @PostConstruct
    public void startUp(){
        recipeService.prepareRecipe();
    }
}
