package com.hlee.CookBoook;

public abstract class Item {

	//private fields
	private String name;
	
	//public getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return getName();
	}
}
