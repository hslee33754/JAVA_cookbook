package com.hlee.CookBoook;

import java.util.ArrayList;

public class Recipes implements ManageItems{
	
	//private field
	private ArrayList<Recipe> recipies = new ArrayList<Recipe>();
	
	//public getter and setter
	public ArrayList<Recipe> getRecipies() {
		return recipies;
	}

	public void setRecipies(ArrayList<Recipe> recipies) {
		this.recipies = recipies;
	}

	@Override
	public void add(Item i) {
		recipies.add((Recipe) i);
		
	}

	@Override
	public void edit(Item i) {
		for(Item it : recipies){
			if(it.getName()==i.getName()){
				it =i;
			}
		}
	}

	@Override
	public void remove(Item i) {
		for(Item it : recipies){
			if(it.getName()==i.getName()){
				recipies.remove(it);
			}
		}		
	}

	@Override
	public Item getItem(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
