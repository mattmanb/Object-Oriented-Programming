package edu.barrinm.assign02;

import java.util.Scanner;

public class CharacterCreation { //
    public static void main(String [] args) {

        //local variables
        String firstName;
        String lastName;
        int heightInInches;
        double weightInPounds;

        Scanner input = new Scanner(System.in);

        Player p = new Player();

        System.out.println("Enter name: ");

        firstName = input.next();

        lastName = input.next();

        System.out.println("Enter height in inches: ");
        heightInInches = input.nextInt();

        System.out.println("Enter weight in pounds: ");
        weightInPounds = input.nextDouble();

        p.setFirstName(firstName);
        p.setLastName(lastName);
        p.setHeight(heightInInches);
        p.setWeight(weightInPounds);

        System.out.println(p);
    }
}
