/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restau;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author yawobeng
 */
public class Restau {

    /**
     * @param args the command line arguments
     */
    
    private static Scanner scanner = new Scanner(System.in);
    
    
    
    
    public static void main(String[] args) {
        MenuPortal portal = new MenuPortal();
        ArrayList<Meal> meals = new ArrayList<Meal>();
        displayWelcomeMessage();
        String[] options = {"Create Meal", "Create Drink", "Show Menu", "Quit"};
        
        
        String title;
        float price;
        int choice;
        boolean running = true;
        while(running) {
            displayOptions(options, "");
            int mainMenuChoice;
            mainMenuChoice = getUserChoice();
            switch(mainMenuChoice) {
                case 1:
                    title = getStringFromUser("Title");
                    price = getFloatFromUser("Price");

                    displayOptions(MealType.describe(), "Meal type");
                    choice = getUserChoice();

                    Meal meal1 = MenuPortal.createMeal(title, price, choice);
                    break;
                case 2: 
                    title = getStringFromUser("Title");
                    price = getFloatFromUser("Price");
                    displayOptions(DrinkType.describe(), "Drink type");
                    choice = getUserChoice();

                    Drink drink = MenuPortal.createDrink(title, price, choice);
                    break;
                case 3:
                    System.out.println(MenuPortal.getMenu());
                    break;
                case 99:
                    System.out.println("Come back soon!");
                    running = false;
                    break;
                default:
                    System.out.println("Wrong input. Choose a number");
                    break;

            }
        }
        
    }
    
    private static void displayWelcomeMessage() {
        System.out.println("********************************");
        System.out.println("* Welcome to the Restau Portal *");
        System.out.println("********************************");
    }
    
    private static void displayOptions (String[] options, String request){
        System.out.println("\n" + request + " options");
        for (int i = 0; i < options.length; i++) {
            if (options[i] == "Quit") {
                System.out.println(99 + ". " + options[i]);
            } else {
                System.out.println((i + 1) + ". " + options[i]);
            }
        }
    }
    
 
    private static int getUserChoice() {
        System.out.println("Enter a choice: ");
        while(!scanner.hasNextInt()) {
            System.out.println("Invalid input. Enter a number");
            scanner.next();
        }
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }
   
    private static String getStringFromUser(String request) {
        System.out.println("Enter a " + request + ": ");
        return scanner.nextLine();
    }
    
    private static int getIntFromUser(String request) {
        System.out.println("Enter a " + request + ": ");
        return scanner.nextInt();
    }
    
    private static float getFloatFromUser(String request) {
        System.out.println("Enter a " + request + ": ");
        while(!scanner.hasNextFloat()) {
            System.out.println("Invalid input. Enter a valid price");
            scanner.next();
        }
        return scanner.nextFloat();
    }
    
    
    
    
    
}
