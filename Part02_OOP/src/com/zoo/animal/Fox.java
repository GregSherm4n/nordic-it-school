package com.zoo.animal;

import com.zoo.interfaces.Sleepable;

public class Fox extends Animal implements Sleepable{
	
	public static final String ANIMAL_KIND = "Fox";
	private Integer tailLength;

	public Integer getTailLength() {
		return tailLength;
	}

	public void setTailLength(Integer tailLength) {
		this.tailLength = tailLength;
	}

	public Fox() {
		super();
	}

	public Fox(String name, Integer age, Float isHungry, Integer tailLength) {
		super(name, age, isHungry);
		this.setKind(ANIMAL_KIND);
		this.tailLength = tailLength;
	}
	
	public String toString() {
		return "Имя:" + getName() + "\r\nВозраст:" + getAge()+ " лет(годов)\r\nДлина хвоста:" + tailLength;
	}
	
	public void say() {
		System.out.println("Тявкает");
	}

	@Override
	public void sleep(boolean status) {
		if (status == true) {
			System.out.println(getKind()+ " " + getName() + " Спит, как убитый.");
		} else {
			System.out.println(getKind()+ " " + getName() + " Бесится от нечего делать.");
		}
		
	}
}
