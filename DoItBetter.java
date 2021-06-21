/**
 *
 * @author Brian Ho
 * email: wmbrianho@gmail.com
 * date: 20 June, 2021
 * purpose: To write a program that constantly one-ups the user's accomplishments
 * 
 */
package foundations.scanner;

import java.util.Scanner;


public class DoItBetter {
    
    public static void main(String[] args) {
        
        int numberOfMiles;
        int numberOfHotDogs;
        int numberOfLanguages;
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("How many miles can you run?");
 //       numberOfMiles = Integer.parseInt(inputReader.nextLine());
        numberOfMiles = Integer.parseInt(inputReader.nextLine()) * 2 + 1;
        System.out.println("I can run " + numberOfMiles + " miles.");
        
        System.out.println();
        System.out.println("How many hot dogs can you eat?");
        numberOfHotDogs = Integer.parseInt(inputReader.nextLine()) * 2 + 1;
        System.out.println("I can eat " + numberOfHotDogs + " hot dogs.");
        
        System.out.println();
        System.out.println("How many language do you know?");
        numberOfLanguages = Integer.parseInt(inputReader.nextLine()) * 2 + 1;
        System.out.println("I know " + numberOfLanguages + " languages.");
        
        
    }
}
