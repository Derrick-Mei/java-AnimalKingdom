package com.dkm;

public abstract class Animals
{
    static int maxId = 0;
    int id;

    String consume = "Chew";
    String name;
    int yearDiscovered;

    String move;
    String breath;
    String reproduce;

    public String getMove() {
        return "This animal moves by " + move +"ing";
    }

    public String getBreath() {
        return "This animal breaths through their " + breath;
    }

    public String getReproduce() {
        return "This animal reproduces by " + reproduce;
    }
}
