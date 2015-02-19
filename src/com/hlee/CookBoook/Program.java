package com.hlee.CookBook;

import java.util.ArrayList;

public class Program {
    
    public static void main(String[] args) {
        //create ingredients
        
        Ingredient i1 = new Ingredient();
        i1.setName("carrot");
        i1.setCalories(20.00);
        i1.setCarbs(10.00);
        i1.setUnitSize("ea");
        
        Ingredient i2 = new Ingredient();
        i2.setName("brocoli");
        i2.setCalories(10.00);
        i2.setCarbs(0);
        i2.setUnitSize("lb");
        
        //create recipes
        
        Recipe recipe1 = new Recipe();
        recipe1.setName("Boiled Vegitables");
        recipe1.setInstructions("Boil them together for 5 minutes");
        
        Recipe recipe2 = new Recipe();
        recipe2.setName("Stirfried Vegitables");
        recipe2.setInstructions("Stir fry");
        
        
        //add ingredients to each recipes
        recipe1.add(i1);
        recipe1.add(i2);
        
        recipe2.add(i1);
        recipe2.add(i2);
        
        //create cookBook(Recipes)
        Recipes cookBook = new Recipes();
        cookBook.add(recipe1);
        cookBook.add(recipe2);
        
        //test arraylist of recipes
        ArrayList<Item> recipes = cookBook.getRecipies();
        for(Item i : recipes){
            System.out.println(i.toString());
        }
        
        //test arraylist of ingredients
        ArrayList<Item> ingredients = recipe2.getIngredients();
        for(Item i : ingredients){
            System.out.println(i.toString());
        }
        
    }
    
}
