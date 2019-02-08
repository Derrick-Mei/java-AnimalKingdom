package com.dkm;

class Birds extends Animals
{
    Birds(String name, int yearDiscovered) {
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
