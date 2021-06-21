/**
 *
 * @author Brian Ho
 * email: wmbrianho@gmail.com
 * date: 20 June, 2021
 * purpose: To create a program that incorporates user input in a conversation.
 * 
 */
 
package foundations.scanner;

import java.util.Scanner;



public class PassingTheTuringTest {
    public static void main(String[] args) {
        
        // declare variables 
        String yourName;
        String myAIName = "Neo";
        String yourFavoriteColor;
        String yourFavoriteFruit;
        
        int yourFavoriteNumber;
        int myFavoriteNumber = 38;
      //  int product;
        
        Scanner inputReader = new Scanner(System.in);
        
        // System.out.print() cannot display strinngs in Netbeans 12.4
        // So use System.out.println() instead
        System.out.println("Hello there!");
        System.out.println("What is your name? "); 
        yourName = inputReader.nextLine();
        
        System.out.println();
        System.out.println("Hi, " + yourName + "! I'm " + myAIName + ".");
        System.out.println("What is your favorite color? ");
        yourFavoriteColor = inputReader.nextLine();
        
        System.out.println();
        System.out.println("Huh, " + yourFavoriteColor + "? Mine's Electric Lime.");
        
        System.out.println();
        System.out.println("I really like limes. They're my favorite fruit, too.");
        System.out.println("What's YOUR favorite fruit, " + yourName + "?");
        yourFavoriteFruit = inputReader.nextLine();
        
        System.out.println();
        System.out.println("Really? " + yourFavoriteFruit + "? That's wild!");
        System.out.println("Speaking of favorites, what's your favorite number?");
        yourFavoriteNumber = Integer.parseInt(inputReader.nextLine());
        
        System.out.println();
        System.out.println(yourFavoriteNumber + " is a cool number. Mine's " + myFavoriteNumber + ".");
        System.out.println("Did you know " + yourFavoriteNumber + " * " + myFavoriteNumber + " is "
            + (yourFavoriteNumber * myFavoriteNumber) + "? That's a cool number too!");
        
        System.out.println();
        System.out.println("Well, thanks for talking to me, " + yourName + "! Goodbye!!");
    }
}
