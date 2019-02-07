package com.dkm;

class Fish extends Animals
{
    Fish(String name, int yearDiscovered) {
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
