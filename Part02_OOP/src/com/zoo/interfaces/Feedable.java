package com.zoo.interfaces;

import com.zoo.exceptions.FeedException;

public interface Feedable {
	
	public void feed(int grams) throws FeedException;
	
	public void feed(float satiety) throws FeedException;
	
}
