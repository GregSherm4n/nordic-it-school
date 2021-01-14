package com.zoo.animal;

import com.zoo.interfaces.Digable;

public class Hedgehog extends Animal implements Digable{
	
	public static final String ANIMAL_KIND = "Hedgehog";
	private boolean hide;

	public boolean isHide() {
		return hide;
	}

	public void setHide(boolean hide) {
		this.hide = hide;
	}

	public Hedgehog() {
		super();
	}

	public Hedgehog(String name, Integer age, Float isHungry, boolean hide) {
		super(name, age, isHungry);
		this.setKind(ANIMAL_KIND);
		this.hide = hide;
	}
	
	public String toString() {
		return "Имя:" + getName() + "\r\nВозраст:" + getAge()+ " лет(годов)\r\nСостояние:" + (isHide() ? " прячется" : " не прячется");
	}
	
	public void say() {
		System.out.println("Фыркает");
	}

	public void dig(boolean status) {
		if (isHide() == true && status == true) {
			status = false;
			System.out.println(getKind()+ " " + getName() + " Не может копать, т.к. сейчас он прячется");
		} else if (status == true)
			System.out.println(getKind()+ " " + getName() + " Приступил к копке.");
		else 
			System.out.println(getKind()+ " " + getName() + " Сейчас не копает.");
		
	}

}
