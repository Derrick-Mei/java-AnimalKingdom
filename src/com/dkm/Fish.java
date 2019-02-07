package com.dkm;

public class Fish extends Animals
{
    public Fish(String name, int yearDiscovered) {
        super(name, yearDiscovered, "swim", "gills", "eggs");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yearDiscovered=" + yearDiscovered +
                ", move='" + move + '\'' +
                ", breath='" + breath + '\'' +
                ", reproduce='" + reproduce + '\'' +
                '}';
    }
}
