package com.hlee.CookBoook;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		Recipe r1 = new Recipe();
		r1.setInstructions("Boil");
		
		Ingredient i1 = new Ingredient();
		i1.setName("egg");
		i1.setCalories(100.00);
		i1.setCarbs(40.00);
		i1.setUnitSize("ea");
		
		Ingredient i2 = new Ingredient();
		i2.setName("brocoli");
		i2.setCalories(10.00);
		i2.setCarbs(0);
		i2.setUnitSize("lb");
		
		r1.add(i1);
		r1.add(i2);
		
		Recipes rs = new Recipes();
		rs.add(r1);
		
		ArrayList<Item> lineItems = r1.getIngredients();
		for(Item i : lineItems){
			System.out.println(i.getName());
		}
		
		System.out.println("My recipe list has " + r1.getItem(name));	
		
	}

}
