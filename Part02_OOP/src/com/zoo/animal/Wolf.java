package com.zoo.animal;

import com.zoo.interfaces.Playable;

public class Wolf extends Animal implements Playable{
	
	public static final String ANIMAL_KIND = "Wolf";
	private boolean alpha;
	
	public String isAlpha() {
		if (alpha = true) {
			return "Вожак стаи";
		} else {
			return "Воин стаи";
		}
	}
	
	public void setAlpha(boolean alpha) {
		this.alpha = alpha;
	}

	public Wolf() {
		super();
	}

	public Wolf(String name, Integer age, Float isHungry, boolean alpha) {
		super(name, age, isHungry);
		this.setKind(ANIMAL_KIND);
		this.alpha = alpha;
	}
	
	public String toString() {
		return "Имя:" + getName() + "\r\nВозраст:" + getAge()+ " лет(годов)\r\nВожак стаи:" + isAlpha();
	}
	
	public void say() {
		System.out.println("Wof");
	}

	public void play(boolean status) {
		if (status == true)
			System.out.println(getKind()+ " " + getName() + " сейчас играет");
		else
			System.out.println(getKind()+ " " + getName() + " сейчас не играет");
	}
	
}
