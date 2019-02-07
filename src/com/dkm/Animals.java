package com.dkm;

abstract class Animals
{
    private static int maxId = 0;
    final int id;

    String consume = "Chew";
    final String name;
    final int yearDiscovered;

    final String move;
    final String breath;
    final String reproduce;

    Animals(String name, int yearDiscovered, String move, String breath, String reproduce) {
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

    String getName() {
        return name;
    }

    int getYearDiscovered() {
        return yearDiscovered;
    }

    String getMove() {
        return move;
    }

    String getBreath() {
        return breath;
    }

    String getReproduce() {
        return reproduce;
    }
}
