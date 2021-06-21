/**
 *
 * @author Brian Ho
 * email: wmbrianho@gmail.com
 * date: 20 June, 2021
 * purpose: To write a small trivia game.
 * 
 */
 
package foundations.scanner;

import java.util.Scanner;


public class AllTheTrivia {
    
    public static void main(String[] args) {
        
        String unitTo1024GB;
        String planetRotateClockwise;
        String planetWithLargestVolcano;
        String mostAbundantElementInAtmosphere;
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("What unit is equivalent to 1,024 Gigabytes? ");
        unitTo1024GB = inputReader.nextLine();
        
        System.out.println("Which planet is the only one that rotates clockwise in our Solar System? ");
        planetRotateClockwise = inputReader.nextLine();
        
        System.out.println("The largest volcano ever discovered in our Solar System is located on which planet? ");
        planetWithLargestVolcano = inputReader.nextLine();
        
        System.out.println("What is the most abundant element in the earth's atmosphere? ");
        mostAbundantElementInAtmosphere = inputReader.nextLine();
        
        System.out.println();
        
        System.out.println("Wow, 1,024 Gigabytes is a " + planetRotateClockwise + "!");
        System.out.println("I didn't know that the largest ever volcano was discovered on " + mostAbundantElementInAtmosphere + "!");
        System.out.println("That's amazing that " + planetWithLargestVolcano + " is the most abundant element in the atmosphere...");
        System.out.println(unitTo1024GB + " is the only planet that rotates clockwise, neat!");
        
    }
}
