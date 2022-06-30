/*
Every 'person' in the game is either fair or a cheater. They each flip a series of coins, scoring heads makes them
happy, tails makes them sad.
Normal coins have a 50% chance of winning a point, while cheaters have a 75% chance of winning.
 */

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args){
        /*Person p1 = new Person(1, "fair");
        Coin c1a = new Coin("Heads");
        Coin c1b = new Coin("Heads");
        Coin c1c = new Coin("Tails");
        Coin c1d = new Coin("Tails");
        p1.addCoin(c1a, c1b, c1c, c1d);
        for(int i=0; i<p1.getCoins().size(); i++){
            System.out.println(p1.getCoins().get(i).getValue());
        }*/
        ArrayList<Person> people = new ArrayList<>();
        Random rand = new Random();

        // Create 50 cheaters
        for(int i=0; i<50; i++){
            people.add(new Person(i, "cheater"));
        } // create 50 fairs
        for(int i=0; i<50; i++){
            people.add(new Person((i+50), "fair"));
        }
    }
}