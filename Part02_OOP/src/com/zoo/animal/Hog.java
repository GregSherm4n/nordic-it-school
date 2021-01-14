package com.zoo.animal;

import com.zoo.interfaces.Waitable;

public class Hog extends Animal implements Waitable{
	
	public static final String ANIMAL_KIND = "Hog";
	private boolean aggressive;

	public boolean isAggressive() {
		return aggressive;
	}

	public void setAggressive(boolean aggressive) {
		this.aggressive = aggressive;
	}

	public Hog() {
		super();
	}

	public Hog(String name, Integer age, Float isHungry, boolean aggressive) {
		super(name, age, isHungry);
		this.setKind(ANIMAL_KIND);
		this.aggressive = aggressive;
	}
	
	public String toString() {
		return "Имя:" + getName() + "\r\nВозраст:" + getAge()+ " лет(годов)\r\nАгрессия:" + (isAggressive() ? " очень агрессивное животное" : " пассивное состояние");
	}
	
	public void say() {
		System.out.println("Хрюшка визжит");
	}

	public void wait(boolean status) {
		if (status == true)
			setAggressive(false);
	}
	
}
