package fr.mds.catlikeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Random;

import fr.mds.catlikeproject.model.Cat;
import fr.mds.catlikeproject.model.Catlike;
import fr.mds.catlikeproject.model.Tiger;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "CatLikeProject";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "MainActivity - onCreate");

        //<Generic> Google : "Java Generics List"
        ArrayList<Integer> myIntList = new ArrayList<>();
        myIntList.add(10);
        myIntList.add(1);
        myIntList.add(5);
        myIntList.add(14);

        ArrayList<Catlike> catlikes = new ArrayList<>();
        catlikes.add(new Cat());
        catlikes.add(new Catlike());
        catlikes.add(new Tiger());

        //foreach
        for (Catlike c : catlikes) {
            Log.d(TAG, c.toString());
        }

        //Cat cat = new Cat();

        //Polymorphism : declared type != true type

        Catlike myCatLike = new Cat("Royal Canin");
        String color = myCatLike.getColor();


        Catlike myRandomCatLike = getRandomCatLike();

        ArrayList<Catlike> catlikes2 = new ArrayList<>();
        catlikes2.add(new Cat("Royal Canin"));
        catlikes2.add(new Cat("Hill's"));
        catlikes2.add(new Cat());
        catlikes2.add(new Tiger());


        if (myRandomCatLike instanceof Cat) {
            Log.d(MainActivity.TAG, "I GOT A TIGER !");

            ((Cat) myRandomCatLike).getCatFoodBrand();
        } else if (myRandomCatLike instanceof Tiger){
            Log.d(MainActivity.TAG,"I GOT A TIGER !")
        } else {
            Log.d(MainActivity.TAG, "I GOT A CATLIKE")
        }


        //return a random catlike (Catlike, Tiger, Cat)
        Catlike getRandomCatLike() {

            int randomInt = new Random().nextInt(3);//0, 1 or 2

            if (randomInt == 0) {
                return new Catlike();
            } else if (randomInt == 1) {
                return new Cat();
            } else {
                return new Tiger();
            }

        }
    }
}
