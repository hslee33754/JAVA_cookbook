package com.hlee.CookBook;

import java.util.ArrayList;

public class Recipes implements ManageItems{
    
    //private field
    private ArrayList<Item> Recipes = new ArrayList<Item>();
    
    //public getter and setter
    public ArrayList<Item> getRecipies() {
        return Recipes;
    }
    
    public void setRecipies(ArrayList<Item> recipies) {
        this.Recipes = recipies;
    }
    
    @Override
    public void add(Item i) {
        Recipes.add(i);
        
    }
    
    @Override
    public void edit(Item i) {
        for(Item it : Recipes){
            if(it.getName()==i.getName()){
                it =i;
            }
        }
    }
    
    @Override
    public void remove(Item i) {
        for(Item it : Recipes){
            if(it.getName()==i.getName()){
                Recipes.remove(i);
            }
        }
        
    }
    
    @Override
    public Item getItem(String name) {
        Item it = null;
        for(Item in : Recipes){
            if(in.getName().equals(name)){
                it=in;
            }
        }
        return it;
    }
    
    
}
