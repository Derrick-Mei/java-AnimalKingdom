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

    public Animals(String name, int yearDiscovered, String move, String breath, String reproduce) {
        maxId++;
        id = maxId;

        this.name = name;
        this.yearDiscovered = yearDiscovered;
        this.move = move;
        this.breath = breath;
        this.reproduce = reproduce;
    }

    public String getMoveString() {
        return name + "s move by " + move +"ing";
    }

    public String getBreathString() {
        return name + "s breath through their " + breath;
    }

    public String getReproduceString() {
        return name + "s reproduce by " + reproduce;
    }

    public int getId() {
        return id;
    }

    public String getConsume() {
        return consume;
    }

    public String getName() {
        return name;
    }

    public int getYearDiscovered() {
        return yearDiscovered;
    }

    public String getMove() {
        return move;
    }

    public String getBreath() {
        return breath;
    }

    public String getReproduce() {
        return reproduce;
    }
}
