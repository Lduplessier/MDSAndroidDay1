package fr.mds.javatraining.model;

import android.util.Log;

import fr.mds.javatraining.MainActivity;

//Javabean encapsulation + default constructor
public class Bicycle extends Vehicule{
    private String color;
    private Wheel frontWheel;
    private Wheel backWheel;

    //default constructor
    public Bicycle() {

    }

    public Bicycle(Wheel frontWheel, Wheel backWheel) {
        this.frontWheel = frontWheel;
        this.backWheel = backWheel;
    }

    public Bicycle(String color, Wheel frontWheel, Wheel backWheel) {
        this.color = color;
        this.frontWheel = frontWheel;
        this.backWheel = backWheel;
    }

    @Override
    void goForward() {
        Log.d(MainActivity.TAG, "Bicycle go forward");
    }

    public Wheel getFrontWheel() { return frontWheel; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public void setFrontWheel(Wheel frontWheel) { this.frontWheel = frontWheel; }

    public Wheel getBackWheel() { return backWheel; }

    public void setBackWheel(Wheel backWheel) { this.backWheel = backWheel; }

    @Override
    public String toString() {
        return "'Bicycle{" +
                "color='" + color + '\'' +
                ", frontWheel=" + frontWheel +
                ", backWheel=" + backWheel +
                '}';
    }
}
