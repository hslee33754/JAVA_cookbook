package com.hlee.CookBoook;

public interface ManageItems {
	void add(Item i);
	void edit(Item i);
	void remove(Item i);
	Item getItem(String name);
	

}
