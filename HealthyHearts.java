/**
 *
 * @author Brian Ho
 * email: wmbrianho@gmail.com
 * date: 20 June, 2021
 * purpose: To create a simple application to help user monitor their health.
 * 
 */
package foundations.scanner;

import java.util.Scanner;


public class HealthyHearts {
    
    public static void main(String[] args) {
        
        int age;
        int maximumHeartRate;
        int lowHeartRateTarget;
        int highHeartRateTarget;
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("What is your age?");
        
        age = Integer.parseInt(inputReader.nextLine());
        
        // calculate healty heart rate range from user input age
        maximumHeartRate = 220 - age;
        lowHeartRateTarget = Math.round(maximumHeartRate * 0.5f);
        highHeartRateTarget = Math.round(maximumHeartRate * 0.85f);
        
        System.out.println("Your maximum heart rate should be " + maximumHeartRate + " beats per minute.");
        System.out.println("Your target HR Zone is " + lowHeartRateTarget + " - " + highHeartRateTarget + " beats per minute.");
    }
}
