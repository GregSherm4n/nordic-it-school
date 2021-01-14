package com.zoo;

import java.util.Scanner;

import com.zoo.animal.*;
import com.zoo.enclosure.Enclosure;
import com.zoo.exceptions.FeedException;
import com.zoo.exceptions.InvalidEnclosure;
import com.zoo.exceptions.SizeException;

public class Zoo {
	
	public static String name(int random) {
		var maleName = new String[] {"Liam", "Noah", "William", "James", "Eliaj",
				"David", "Aiden", "Carter", "Logan", "Mason", "Owen", "Luke",
				"Levi", "Gabriel", "Joshua", "Isaac", "Ryan", "Nathan", "Leo",
				"Jacob"};
		
		var femaleName = new String[] {"Maya", "Willow", "Nova", "Emilia", "Everly",
				"Bella", "Brooklyn", "Violet", "Hazel", "Emma", "Olivia", "Ava",
				"Abigail", "Amelia", "Sofia", "Camila", "Scarlett", "Madison",
				"Luna", "Grace"};
		
		String result;
		if (random % 2 == 0) {
			result = femaleName[(int)(Math.random()*19)];
		} else {
			result = maleName[(int)(Math.random()*19)];
		}
		
		return result;
	}
	
	public static void main(String[] args) throws FeedException {
		//antelopes
		var antelope1 = new Antelope(name((int)(Math.random()*100)), 
				(int)(Math.random()*10 + 1), (float)(Math.random()), "Africa");
		
		var antelope2 = new Antelope(name((int)(Math.random()*100)), 
				(int)(Math.random()*10 + 1), (float)(Math.random()), "Africa");
		
		var antelope3 = new Antelope(name((int)(Math.random()*100)), 
				(int)(Math.random()*10 + 1), (float)(Math.random()), "Africa");
		
		//foxes
		var fox1 = new Fox(name((int)(Math.random()*100)), 
				(int)(Math.random()*10 + 1), (float)(Math.random()), (int)(Math.random()*60 + 1));
		
		var fox2 = new Fox(name((int)(Math.random()*100)), 
				(int)(Math.random()*10 + 1), (float)(Math.random()), (int)(Math.random()*60 + 1));
		
		var fox3 = new Fox(name((int)(Math.random()*100)), 
				(int)(Math.random()*10 + 1), (float)(Math.random()), (int)(Math.random()*60 + 1));
		
		//hares
		var hare1 = new Hare(name((int)(Math.random()*100)), 
				(int)(Math.random()*10 + 1), (float)(Math.random()), "Русый");
		var hare2 = new Hare(name((int)(Math.random()*100)), 
				(int)(Math.random()*10 + 1), (float)(Math.random()), "Русый");
		var hare3 = new Hare(name((int)(Math.random()*100)), 
				(int)(Math.random()*10 + 1), (float)(Math.random()), "Белый");
		
		//hedgehogs
		var hedgehog1 = new Hedgehog(name((int)(Math.random()*100)), 
				(int)(Math.random()*10 + 1), (float)(Math.random()), true);
		var hedgehog2 = new Hedgehog(name((int)(Math.random()*100)), 
				(int)(Math.random()*10 + 1), (float)(Math.random()), false);
		var hedgehog3 = new Hedgehog(name((int)(Math.random()*100)), 
				(int)(Math.random()*10 + 1), (float)(Math.random()), true);
		var hedgehog4 = new Hedgehog(name((int)(Math.random()*100)), 
				(int)(Math.random()*10 + 1), (float)(Math.random()), true);
		
		//hogs
		var hog1 = new Hog(name((int)(Math.random()*100)), 
				(int)(Math.random()*10 + 1), (float)(Math.random()), true);
		
		//rams
		var ram1 = new Ram(name((int)(Math.random()*100)), 
				(int)(Math.random()*10 + 1), (float)(Math.random()), "Закрученные");
		var ram2 = new Ram(name((int)(Math.random()*100)), 
				(int)(Math.random()*10 + 1), (float)(Math.random()), "Прямые");
		var ram3 = new Ram(name((int)(Math.random()*100)), 
				(int)(Math.random()*10 + 1), (float)(Math.random()), "Поломанные");
		var ram4 = new Ram(name((int)(Math.random()*100)), 
				(int)(Math.random()*10 + 1), (float)(Math.random()), "Короткие");
		
		//wolfs
		var wolf1 = new Wolf(name((int)(Math.random()*100)), 
				(int)(Math.random()*10 + 1), (float)(Math.random()), true);
		var wolf2 = new Wolf(name((int)(Math.random()*100)), 
				(int)(Math.random()*10 + 1), (float)(Math.random()), false);
		var wolf3 = new Wolf(name((int)(Math.random()*100)), 
				(int)(Math.random()*10 + 1), (float)(Math.random()), false);
		
		var enclosure = Enclosure.getInstance();
		enclosure.createEnclosure(Antelope.ANIMAL_KIND);
		enclosure.createEnclosure(Fox.ANIMAL_KIND);
		enclosure.createEnclosure(Hare.ANIMAL_KIND);
		enclosure.createEnclosure(Hedgehog.ANIMAL_KIND);
		enclosure.createEnclosure(Hog.ANIMAL_KIND);
		enclosure.createEnclosure(Ram.ANIMAL_KIND);
		enclosure.createEnclosure(Wolf.ANIMAL_KIND);
		
		//добавление в вольеры с отработкой исключения
		try {
			enclosure.addAnimalToEnclosure(antelope1);
			enclosure.addAnimalToEnclosure(antelope2);
			enclosure.addAnimalToEnclosure(antelope3);
			
			enclosure.addAnimalToEnclosure(fox1);
			enclosure.addAnimalToEnclosure(fox2);
			enclosure.addAnimalToEnclosure(fox3);
			
			enclosure.addAnimalToEnclosure(hare1);
			enclosure.addAnimalToEnclosure(hare2);
			enclosure.addAnimalToEnclosure(hare3);
			
			enclosure.addAnimalToEnclosure(hedgehog1);
			enclosure.addAnimalToEnclosure(hedgehog2);
			enclosure.addAnimalToEnclosure(hedgehog3);
			enclosure.addAnimalToEnclosure(hedgehog4);
			
			enclosure.addAnimalToEnclosure(hog1);
			
			enclosure.addAnimalToEnclosure(ram1);
			enclosure.addAnimalToEnclosure(ram2);
			enclosure.addAnimalToEnclosure(ram3);
			enclosure.addAnimalToEnclosure(ram4);
			
			enclosure.addAnimalToEnclosure(wolf1);
			enclosure.addAnimalToEnclosure(wolf2);
			enclosure.addAnimalToEnclosure(wolf3);
			
		} catch (InvalidEnclosure e){
			e.printStackTrace();
		} 
		System.out.println("\r\n++++Вольеры++++\r\n");
		System.out.println(enclosure.getEnclosureList());
		System.out.println("\r\n++++Интерфейсы++++\r\n");
		System.out.print("Antelopes\r\n");
		try {
			antelope1.move(15, 6);
			antelope2.move(45.3204f, 6.32f);
			antelope1.move(52, 45);
		} catch (SizeException e) {
			System.out.println("Не может преодолеть границы барьера.");
		}
		
		System.out.print("Foxes\r\n");
		fox1.sleep(true);
		fox2.sleep(false);
		
		System.out.print("Hares\r\n");
		hare1.feed(0.43f);
		hare2.feed(-4);
		
		System.out.print("Hedgehogs\r\n");
		hedgehog1.dig(true);
		hedgehog2.dig(true);
		hedgehog3.dig(false);
		
		System.out.print("Hog\r\n");
		hog1.wait(true);
		
		System.out.print("Rams\r\n");
		ram1.peek((int)(Math.random()*450));
		ram1.peek((int)(Math.random()*450));
		ram2.peek((int)(Math.random()*450));
		
		System.out.print("Wolves\r\n");
		wolf1.play(false);
		wolf2.play(true);
		wolf3.play(true);
		
		
	}

}
