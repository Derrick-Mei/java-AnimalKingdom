package com.dkm;

class Mammals extends Animals
{
//    String move = "walk";
//    String breath = "lungs";
//    String reproduce = "live births";

    Mammals(String name, int yearDiscovered) {
        super(name, yearDiscovered, "walk", "lungs", "live births");
    }

    @Override
    public String toString() {
        return "Mammals{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", move='" + move + '\'' +
                ", yearDiscovered=" + yearDiscovered +
                ", breath='" + breath + '\'' +
                ", reproduce='" + reproduce + '\'' +
                '}';
    }
}
