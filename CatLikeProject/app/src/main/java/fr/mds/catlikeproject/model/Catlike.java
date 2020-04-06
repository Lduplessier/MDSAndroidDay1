package fr.mds.catlikeproject.model;

import android.util.Log;

import fr.mds.catlikeproject.MainActivity;

public class Catlike {

    private String color;
    private String height;

    protected void eat() {
        Log.d(MainActivity.TAG, "Catlike is eating");
    }

    public Catlike(){
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Catlike{" +
                "color='" + color + '\'' +
                ", height='" + height + '\'' +
                '}';
    }
}
