package com.example.model;

import java.util.*;
import com.example.database.*;

public class BeerExpert {
	public List getBrands(String color) {
		List<String> brands = new ArrayList<String>();
		
		BeerText BeerT = new BeerText();
		
		
		if (color.equals("amber")) {
		brands.add(BeerT.getText1());
		brands.add(BeerT.getText2());
		}
		else {
		brands.add(BeerT.getText3());
		brands.add(BeerT.getText4());
		}
		return(brands);
		
		
		/*if (color.equals("amber")) {
		brands.add("Jack Amber");
		brands.add("Red Moose");
		}
		else {
		brands.add("Jail Pale Ale");
		brands.add("Gout Stout");
		}
		return(brands);*/
	}
}
