import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * hello
 */

public class mainGame {

    public static void main(String[] args) {
        /* use these to comment out a block of code */

        String x = "Guess a random number and narrow until you find it. ";
        System.out.println(x);

        Scanner scan = new Scanner(System.in);
        // start the game with guessing a number. demo of variables and while loop;

        Random rand = new Random();
        // returns a random int between 0 and the specified integer;
        int theSecretNumber = rand.nextInt(50);
        int yourNumber = 0;

        while(theSecretNumber != yourNumber) {
            // get the input from the user;
            yourNumber = scan.nextInt();
            // check to see if the guess was correct;
            if(yourNumber < theSecretNumber) {
                System.out.println("Your number is too low. ");
            } else if (yourNumber > theSecretNumber) {
                System.out.println("Your number is too high. ");
            }

        }
        System.out.println("You got the random number.");
       

        // FOR LOOP
        for (int i = 0; i < 9; i++) {
            System.out.println("The Number is " + i + ", ");
        }

        System.out.println("------------------");
        // count up by 3 by incrimenting i by 3
        
        for (int i = 0; i < 48; i = i + 3) {
            System.out.println("The Number is " + i + ", ");
        }

        System.out.println("------------------");

        // ARRAYS ARE HOUSED IN CURLEY BRACKETS!!!
        
        int [] luckyNumbers = {
            13,
            14, 
            19,
            29,
            99,
        };

        for (int i = 0; i < luckyNumbers.length; i++) {
            System.out.println("The Number at index " + i + " is " + luckyNumbers[i]);
        }

        // ArrayList can change!

        ArrayList<Integer> unluckyNumbers = new ArrayList<>();


        unluckyNumbers.add(7);
        unluckyNumbers.add(13);
        unluckyNumbers.add(77);
        unluckyNumbers.add(81);
        unluckyNumbers.add(514);

        for (int i = 0; i < unluckyNumbers.size(); i++) {
            System.out.println("The UnluckyNumber at index " + i + " is " + unluckyNumbers.get(i));
        }
        // .size() Method for arrayList index length;
        // .get() Method will extract the index from the active loop;

        System.out.println("===-=-=-=-=-=--=-=-=-=--===-=-=-----===");

        // forEach loop
        for (int number : unluckyNumbers) {
            System.out.println("The UnluckyNumber is " + number);
        }
 

        // MAKING OBJECTS
        
        CaveMan c1 = new CaveMan();
        CaveMan c2 = new CaveMan("Ogg", 18, 130.4f, new ArrayList<Rock>());

        c1.sayHi();
        c2.sayHi();

        c1.setName("Ugg");
        c1.setAge(20);
        c1.setWeight(180f);

        // printing the toString() method defined in the public class to print the data type and data;
        System.out.println("c1 " + c1.toString());
        System.out.println("c2 " + c2.toString());


        Rock r1 = new Rock();
        Rock r2 = new Rock("redish", 210f);
        Rock r3 = new Rock("Greenish", 54f);
        Rock r4 = new Rock("Turquoise-ish", 51f);


        ArrayList<Rock> allOfTheRocks = new ArrayList<>();


        allOfTheRocks.add(r1);
        allOfTheRocks.add(r2);
        allOfTheRocks.add(r3);
        allOfTheRocks.add(r4);
        

        System.out.println("----------------**-----------------");

        c2.setRockCollection(allOfTheRocks);

        System.out.println(r1.toString());
        System.out.println(r2.toString());

        System.out.println("----------------******-----------------");

        

        ArrayList<Rock> someRocks = new ArrayList<>();
        someRocks.add(r1);
        someRocks.add(r3);

        c1.setRockCollection(someRocks);

        System.out.println("c1 " + c1.toString());
        System.out.println("c2 " + c2.toString());


        // for loop for objects 

        for (Rock rock: allOfTheRocks) {
            System.out.println("each rock, looping over allOfTheRocks ArrayList(): " + rock);
        }
    };
};