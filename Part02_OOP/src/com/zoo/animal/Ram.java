package com.zoo.animal;

import com.zoo.interfaces.Peekable;

public class Ram extends Animal implements Peekable{
	
	public static final String ANIMAL_KIND = "Ram";
	private String hornType;
	
	public String getHornType() {
		return hornType;
	}

	public void setHornType(String hornType) {
		this.hornType = hornType;
	}

	public Ram() {
		super();
	}

	public Ram(String name, Integer age, Float isHungry, String hornType) {
		super(name, age, isHungry);
		this.setKind(ANIMAL_KIND);
		this.hornType = hornType;
	}
	
	public String toString() {
		return "Имя:" + getName() + "\r\nВозраст:" + getAge()+ " лет(годов)\r\nТип рогов:" + hornType;
	}
	
	public void say() {
		System.out.println("Bee-bee");
	}

	public void peek(int grass) {
		setIsHungry(getIsHungry() + (float)grass/100);
		if (getIsHungry() >= 1) {
			setIsHungry(1f);
			System.out.println(getKind() + " " + getName() + " Наконец-то он наелся травки!");
		}
	}
	
}
