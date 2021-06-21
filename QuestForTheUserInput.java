/**
 *
 * @author Brian Ho
 * email: wmbrianho@gmail.com
 * date: 20 June, 2021
 * purpose: To create a new prpgram using the code provided by exercise.
 */

package foundations.scanner;

import java.util.Scanner;

public class QuestForTheUserInput {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        
        String yourName;
        String yourQuest;
        double velocityOfSwallow;
        
        //  We can use the Scanner's readLine to assign value to our strings
        // because its return type is string 

        System.out.println("What is your name?? ");  // My NetBeans 12.4 somehow doesn't display the prompt from System.out.print()
        yourName = inputReader.nextLine();
        
        System.out.println("What is your quest?! "); // My NetBeans 12.4 somehow doesn't display the prompt from System.out.print()
        yourQuest = inputReader.nextLine();
        
        // When we get to our double data type, we can use Scanner's nextDouble method
        // or we can use the Double.parseDouble to convert the nextLine's String 
        System.out.println("What is the airspeed velocity of an unladen swallow?!?! "); // My NetBeans 12.4 somehow doesn't display the prompt from System.out.print()
        velocityOfSwallow = Double.parseDouble(inputReader.nextLine());
        System.out.println();
        System.out.println("How do you know " + velocityOfSwallow + " is correct, " 
           + yourName + "?");
        System.out.println("You didn't even know if the swallow was African or European!");
        System.out.println("Maybe skip ansering things about birds and instead go " + yourQuest + ".");
    }
}
