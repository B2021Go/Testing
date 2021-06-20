/**
 *
 * @author Brian Ho
 * email: wmbrianho@gmail.com
 * date: 19 June, 2021
 * purpose: To calculate the total cost for home replacement windows
 */
package brianhoamazonjava.windowmaster;

import java.util.Scanner;

public class WindowMaster {
    public static void main(String [] args) {
        // declare variables for height and width
        float height = 0;
        float width = 0;
        
        // declare String variables to hold the user's height and width input
        String stringHeight;
        String stringWidth;
        
        // declare other variables
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;
        
        // declare and initialize the Scanner
        Scanner myScanner = new Scanner(System.in);
        
        // declare variables for glass and trim cost 
        float glassPerSqFoot = 0;
        float trimPerLinearFoot = 0;
        String stringGlassPerSqFoot;
        String stringTrimPerLinearFoot;
      
        // declare variables for number of windows
        int numberOfWindows = 0;
        String stringNumberOfWindows;
        
        // declare boolean variables for user input validation
        boolean isHeightValid = false;
        boolean isWidthValid = false;
        boolean isNumOfWinValid = false;
        boolean isGlassPerSqFootValid = false;
        boolean isTrimPerLinearFootValid = false;
        
        // get and validate window height input from the user
        do {
            try {
                System.out.println("Please enter window height in feet:");
                stringHeight = myScanner.nextLine();
                height = Float.parseFloat(stringHeight);
                
                if (height > 0) {
                    isHeightValid = true;
                }
            } catch(NumberFormatException ex){
                System.out.println("That was not a floating number!");
            }
        } while(!isHeightValid);
        
         // get and validate window width input from the user
        do {
            try {
                System.out.println("Please enter window width in feet:");
                stringWidth = myScanner.nextLine();
                width = Float.parseFloat(stringWidth);
                
                if (width > 0) {
                    isWidthValid = true;
                }
            } catch(NumberFormatException ex){
                System.out.println("That was not a floating number!");
            }
        } while(!isWidthValid);
        
        // get and validate windows number input from the user
        do {
            try {
                System.out.println("Please enter number of windows:");
                stringNumberOfWindows = myScanner.nextLine();
                numberOfWindows = Integer.parseInt(stringNumberOfWindows);
                
                if (numberOfWindows > 0) {
                    isNumOfWinValid = true;
                }
            } catch(NumberFormatException ex){
                System.out.println("That was not an integer number!");
            }
        } while(!isNumOfWinValid);

        // get and validate cost of glass per square foot input from the user
        do {
            try {
                System.out.println("Please enter cost of glass per square foot:");
                stringGlassPerSqFoot = myScanner.nextLine();
                glassPerSqFoot = Float.parseFloat(stringGlassPerSqFoot);
                
                if (glassPerSqFoot > 0) {
                    isGlassPerSqFootValid = true;
                }
            } catch(NumberFormatException ex){
                System.out.println("That was not a floating number!");
            }
        } while(!isGlassPerSqFootValid);

       // get and validate cost of trim per linear foot input from the user
        do {
            try {
                System.out.println("Please enter cost of trim per linear foot");
                stringTrimPerLinearFoot = myScanner.nextLine();
                trimPerLinearFoot = Float.parseFloat(stringTrimPerLinearFoot);
                
                if (trimPerLinearFoot > 0) {
                    isTrimPerLinearFootValid = true;
                }
            } catch(NumberFormatException ex){
                System.out.println("That was not a floating number!");
            }
        } while(!isTrimPerLinearFootValid);
    
 /*   Block of codes used before refactoring with try/catch validation on the user input  
        System.out.println("Please enter window height in feet");
        stringHeight = myScanner.nextLine();
        System.out.println("Please enter window width in feet");
        stringWidth = myScanner.nextLine();
        System.out.println("Please enter number of windows");
        stringNumberOfWindows = myScanner.nextLine();
        System.out.println("Please enter cost of glass per square foot");
        stringGlassPerSqFoot = myScanner.nextLine();
        System.out.println("Please enter cost of trim per linear foot");
        stringTrimPerLinearFoot = myScanner.nextLine();
        
        // convert String values of user input to corresponding data types
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        numberOfWindows = Integer.parseInt(stringNumberOfWindows);
        glassPerSqFoot = Float.parseFloat(stringGlassPerSqFoot);
        trimPerLinearFoot = Float.parseFloat(stringTrimPerLinearFoot);
 ******/
 
 
        // calculate the area of the window
        areaOfWindow = height * width;
        
        // calculate the perimeter of the window
        perimeterOfWindow = 2 * (height + width);
        
        // calculate the total cost 
        cost = numberOfWindows * ((glassPerSqFoot * areaOfWindow) + (trimPerLinearFoot * perimeterOfWindow));
        
        // display the results to the user
        System.out.println("Window height = " + height);
        System.out.println("Window width = " + width);
        System.out.println("Window numbers = " + numberOfWindows);
        System.out.println("Cost of glass per square foot = " + glassPerSqFoot);
        System.out.println("Cost of trim per linear foot = " + trimPerLinearFoot);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost = " + cost);
    }  
}
