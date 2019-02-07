package com.dkm;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Mammals Panda = new Mammals("Panda", 1869);
        System.out.println(Panda);

        Mammals Zebra = new Mammals("Zebra", 1778);
        System.out.println(Zebra);
        System.out.println(Zebra.getBreathString());
    }
}
