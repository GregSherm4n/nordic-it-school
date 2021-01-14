package com.zoo.animal;

import com.zoo.interfaces.Movable;
import com.zoo.exceptions.SizeException;

public class Antelope extends Animal implements Movable{
	
	public static final String ANIMAL_KIND = "Antelope";
	private String region;
	
	public String getRegion() {
		return region;
	}
	
	public void setRegion(String region) {
		this.region = region;
	}

	public Antelope() {
		super();
	}
	
	public Antelope(String name, Integer age, Float isHungry, String region) {
		super(name, age, isHungry);
		this.setKind(ANIMAL_KIND);
		this.region = region;
	}
	
	public String toString() {
		return "Имя:" + getName() + "\r\nВозраст:" + getAge()+ " лет(годов)\r\nРегион проживания:" + region;
	}

	public void say() {
		System.out.println("Говорит по оленячьи");
	}

	public void move(float x, float y) throws SizeException {
		if (x < - 50 || y < - 50 || x > 50 || y > 50) {
			System.out.println(getKind() + " " + getName() + " Не может преодолеть границы барьера.");
			x = 0;
			y = 0;
		}
		if (x > 0 && y > 0) {
			System.out.println(getKind() + " " + getName() + " Движется к северо-восточной части вольера");
		} else if (x > 0 && y < 0) {
			System.out.println(getKind() + " " + getName() + " Движется к юго-восточной части вольера");
		} else if (x < 0 && y > 0) {
			System.out.println(getKind() + " " + getName() + " Движется к северо-западной части вольера");
		} else if (x < 0 && y < 0) {
			System.out.println(getKind() + " " + getName() + " Движется к юго-западной части вольера");
		} else if (x == 0 && y > 0) {
			System.out.println(getKind() + " " + getName() + " Движется к северной части вольера");
		} else if (x == 0 && y < 0) {
			System.out.println(getKind() + " " + getName() + " Движется к южной части вольера");
		} else if (x < 0 && y == 0) {
			System.out.println(getKind() + " " + getName() + " Движется к западной части вольера");
		} else if (x > 0 && y == 0) {
			System.out.println(getKind() + " " + getName() + " Движется к восточной части вольера");
		} 	
	}
	
	public void move(int x, int y) throws SizeException {
		if (x < - 50 || y < - 50 || x > 50 || y > 50) {
			System.out.println(getKind() + " " + getName() + " Не может преодолеть границы барьера.");
			x = 0;
			y = 0;
		}
		if (x > 0 && y > 0) {
			System.out.println(getKind() + " " + getName() + " Движется к северо-восточной части вольера");
		} else if (x > 0 && y < 0) {
			System.out.println(getKind() + " " + getName() + " Движется к юго-восточной части вольера");
		} else if (x < 0 && y > 0) {
			System.out.println(getKind() + " " + getName() + " Движется к северо-западной части вольера");
		} else if (x < 0 && y < 0) {
			System.out.println(getKind() + " " + getName() + " Движется к юго-западной части вольера");
		} else if (x == 0 && y > 0) {
			System.out.println(getKind() + " " + getName() + " Движется к северной части вольера");
		} else if (x == 0 && y < 0) {
			System.out.println(getKind() + " " + getName() + " Движется к южной части вольера");
		} else if (x < 0 && y == 0) {
			System.out.println(getKind() + " " + getName() + " Движется к западной части вольера");
		} else if (x > 0 && y == 0) {
			System.out.println(getKind() + " " + getName() + " Движется к восточной части вольера");
		} 
	}

}
