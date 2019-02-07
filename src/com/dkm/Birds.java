package com.dkm;

public class Birds extends Animals
{
    public Birds(String name, int yearDiscovered) {
        super(name, yearDiscovered, "fly", "lungs", "eggs");
    }

    @Override
    public String toString() {
        return "Birds{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yearDiscovered=" + yearDiscovered +
                ", move='" + move + '\'' +
                ", breath='" + breath + '\'' +
                ", reproduce='" + reproduce + '\'' +
                '}';
    }
}
