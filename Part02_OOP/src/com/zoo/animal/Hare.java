package com.zoo.animal;

import com.zoo.interfaces.Feedable;
import com.zoo.exceptions.FeedException;

public class Hare extends Animal implements Feedable{
	
	public static final String ANIMAL_KIND = "Hare";
	private String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Hare() {
		super();
	}

	public Hare(String name, Integer age, Float isHungry, String color) {
		super(name, age, isHungry);
		this.setKind(ANIMAL_KIND);
		this.color = color;
	}
	
	public String toString() {
		return "Имя:" + getName() + "\r\nВозраст:" + getAge()+ " лет(годов)\r\nОкрас:" + color;
	}
	
	public void say() {
		System.out.println("Что то говорит непонятное");
	}

	public void feed(int grams) throws FeedException {
		if (grams <=0)
			System.out.println(getKind()+ " " + getName() + " Неверные данные!");
		setIsHungry(getIsHungry() + (float)grams/50);
		if (getIsHungry() >= 1) 
			setIsHungry(1f);
			
	}

	public void feed(float satiety) throws FeedException {
		if (satiety <= 0 || satiety > 1) 
			System.out.println(getKind()+ " " + getName() + " Неверные данные!");
		
		setIsHungry(getIsHungry() + satiety);
		if (getIsHungry() >= 1) 
			setIsHungry(1f);
		
	}
	
}
