package edu.barrinm.assign03;
import java.util.Scanner;

public class LetterPrinter {

    public static Letterhead askForLetterheadData(Scanner input) {
        String name;
        char boundaryChar;
        String [] sloganLines = new String[4]; //string array of size 4
        System.out.println("Enter business name:");
        name = input.nextLine(); //reads the business name
        System.out.println("Enter boundary char:");
        String sBChar = input.nextLine(); //temporary string for boundary char
        boundaryChar = sBChar.charAt(0); //gets the first char of sBChar
        System.out.println("Enter slogan (max 4 lines):");
        for(int i = 0; i < sloganLines.length; i++) { //reads the next 4 lines of user input
            sloganLines[i] = input.nextLine();
        }
        Letterhead l = new Letterhead(name, sloganLines, boundaryChar); //new Letterhead object
        return l;
    }

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in); //new Scanner object
        Letterhead header = askForLetterheadData(input); //new Letterhead object
        System.out.println("Your new letterhead");
        System.out.println(header); //prints the Letterhead
    }
}
