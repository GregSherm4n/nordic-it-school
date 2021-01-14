package com.zoo.interfaces;

import com.zoo.exceptions.SizeException;

public interface Movable {

	public void move(float x, float y) throws SizeException;
	
}
