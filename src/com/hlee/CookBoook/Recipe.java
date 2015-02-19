package com.hlee.CookBoook;

import java.util.ArrayList;

public class Recipe extends Item implements ManageItems{
	
	//private fields
	private String instructions;
	private ArrayList<Item> ingredients = new ArrayList<Item>();
	
	//public getter and setter
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	public ArrayList<Item> getIngredients() {
		return ingredients;
	}
	public void setIngredients(ArrayList<Item> ingredients) {
		this.ingredients = ingredients;
	}
	
	@Override
	public void add(Item i) {
		ingredients.add(i);		
	}
	@Override
	public void edit(Item i) {
		for(Item it : ingredients){
			if(it.getName()==i.getName()){
				it =i;
			}
		}
	}
	@Override
	public void remove(Item i) {
		for(Item it : ingredients){
			if(it.getName()==i.getName()){
				ingredients.remove(it);
			}
		}
	}
	@Override
	public Item getItem(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
