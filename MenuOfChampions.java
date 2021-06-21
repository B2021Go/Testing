/**
 *
 * @author Brian Ho
 * email: wmbrianho@gmail.com
 * date: 20 June, 2021
 * purpose: To write a program that displays a menu for a restaurant.
 */
package brianhoamzonjava.foundations.variables;


public class MenuOfChampions {
    public static void main(String[] args) {
        
        String border1 = "-*@*-*@*-*@*-*@*-*@*-*@*-*@*-*@*-*@*-*@*-*@*-*@*-*@*-*@*-*@*-";
        String border2 = "-*&*-*&*-*&*-*&*-*&*-*&*-*&*-*&*-*&*-*&*-*&*-*&*-*&*-*&*-*&*-";
        
        String restaurantName = "Champions Resturant";
        
        String foodName1 = "Cheess Grill Beef Burger";
        String foodName2 = "Grilled Chicken Sandwich";
        String foodName3 = "Premium Fruit Smoothie";
        
        float priceOfFood1 = 9.75f;
        float priceOfFood2 = 8.50f;
        float priceOfFood3 = 3.75f;
                
        System.out.println(border1 + "\n");
        System.out.println("           Welcome to " + restaurantName);
        System.out.println("           Todays Menu Is..." + "\n");
        System.out.println(border2 + "\n");    
        
        System.out.print("           $ " + String.format("%.2f", priceOfFood1) + " ***** ");
        System.out.println(foodName1);
        System.out.print("           $ " + String.format("%.2f", priceOfFood2) + " ***** ");
        System.out.println(foodName2);
        System.out.print("           $ " + String.format("%.2f", priceOfFood3) + " ***** ");
        System.out.println(foodName3);
        
        System.out.println("\n" + border1);
    }
}
