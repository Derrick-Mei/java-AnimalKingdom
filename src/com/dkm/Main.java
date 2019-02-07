package com.dkm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Mammals Panda = new Mammals("Panda", 1869);
        Mammals Zebra = new Mammals("Zebra", 1778);
        Mammals Koala = new Mammals("Koala", 1816);
        Mammals Sloth = new Mammals("Sloth", 1804);
        Mammals Armadillo = new Mammals("Armadillo", 1758);
        Mammals Raccoon = new Mammals("Raccoon", 1758);
        Mammals Bigfoot = new Mammals("Bigfoot", 2021);

        Birds Pigeon = new Birds("Pigeon", 1837);
        Birds Peacock = new Birds("Peacock", 1821);
        Birds Toucan = new Birds("Toucan", 1758);
        Birds Parrot = new Birds("Parrot", 1824);
        Birds Swan = new Birds("Swan", 1758);

        Fish Salmon = new Fish("Salmon", 1758);
        Fish Catfish = new Fish("Catfish", 1817);
        Fish Perch = new Fish("Perch", 1758);

        // Multiple Ways of adding to ArrayList all at once
//        List<Animals> animalKingdomList = Arrays.asList(Panda, Zebra, Koala);
//        ArrayList<Animals> animalKingdomArrayList = new ArrayList<>();
//        animalKingdomArrayList.addAll(animalKingdomList);
//        System.out.println(animalKingdomArrayList);

        // Second Way That's a bit shorter to add multiple things to ArrayList
        ArrayList<Animals> animalKingdomList = new ArrayList<>();
        Collections.addAll(animalKingdomList, Panda, Zebra, Koala, Sloth, Armadillo, Raccoon, Bigfoot, Pigeon, Peacock, Toucan, Parrot, Swan, Salmon, Catfish, Perch);
//        System.out.println(animalKingdomList);

        System.out.println("\n*** Descending order by year named ***");
        animalKingdomList.sort((o1, o2) -> o1.getYearDiscovered() - o2.getYearDiscovered());
        animalKingdomList.forEach(o -> System.out.println(o.getName() + " | " + o.getYearDiscovered()));

        System.out.println("\n*** List Animals Alphabetically");
        animalKingdomList.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        animalKingdomList.forEach(o -> System.out.println((animalKingdomList.indexOf(o)+1) + ". " + o.getName()));

        System.out.println("\n *** List Animals by how the move ***");
        animalKingdomList.sort((o1, o2) -> o1.getMove().compareToIgnoreCase(o2.getMove()));
        animalKingdomList.forEach(o -> System.out.println(o.getName() + " | " + o.getMove()));

        System.out.println("\n *** List Animals with Lungs ***");
        animalKingdomList.forEach(o -> {
            if (o.getBreath().equalsIgnoreCase("lungs")) {
                System.out.println(o.getName() + " has lungs");
            }
        });

        System.out.println("\n *** List Animals with Lungs && named in 1758 ***");
        animalKingdomList.forEach(o -> {
            if ((o.getBreath().equalsIgnoreCase("lungs")) && o.getYearDiscovered()==1758) {
                System.out.println(o.getName() + " has lungs and was discovered in " + o.getYearDiscovered());
            }
        });

        System.out.println("\n *** List Animals with Lungs && Lay Eggs ***");
        animalKingdomList.forEach(o -> {
            if ((o.getBreath().equalsIgnoreCase("lungs")) && o.getReproduce().equalsIgnoreCase("eggs")) {
                System.out.println(o.getName() + " has lungs and reproduces by laying " + o.getReproduce());
            }
        });

        System.out.println("\n *** List Animals Alphabetically that were named in 1758 ***");
        animalKingdomList.removeIf(o -> o.getYearDiscovered() != 1758);
        animalKingdomList.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        animalKingdomList.forEach(o -> System.out.println(o.getName() + " | " + o.getYearDiscovered()));
    }
}
