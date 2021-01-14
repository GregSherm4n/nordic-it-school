package com.zoo.enclosure;

import java.util.ArrayList;
import java.util.HashMap;

import com.zoo.animal.Animal;
import com.zoo.exceptions.InvalidEnclosure;

public class Enclosure {
	
	private static final Enclosure INSTANCE = new Enclosure();
	private HashMap<String, ArrayList<Object>> enclosureMap;
	
	public static Enclosure getInstance() {
		return INSTANCE;
	}
	
	private Enclosure() {
		enclosureMap = new HashMap<String, ArrayList<Object>>();
	}
	
	public void createEnclosure(String animal) {
		enclosureMap.putIfAbsent(animal, new ArrayList<Object>());
	}

	public HashMap<String, ArrayList<Object>> getEnclosureList() {
		return enclosureMap;
	}
	
	public void addAnimalToEnclosure(Animal animal) throws InvalidEnclosure{
		if (!enclosureMap.containsKey(animal.getKind())) {
			throw new InvalidEnclosure("Вольер для животного типа: " + animal.getKind() + " отсутствует");
		}
		var animals = enclosureMap.get(animal.getKind());
		animals.add(animal);
		enclosureMap.put(animal.getKind(), animals);
	}
	
}