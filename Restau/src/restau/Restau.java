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
    
    private static final Scanner scanner = new Scanner(System.in);
    
    
    
    
    public static void main(String[] args) {
        displayWelcomeMessage();
        String[] options = {"Menu portal", "Create character", "Quit"};
        boolean isRunning = true;
        int choice;
        
        while(isRunning) {
            displayOptions(options, "");
            choice = getUserChoice();
            switch (choice) {
                case 1 -> {
                    menuPortal();
                }
                case 2 -> {
                    characterPortal();
                }
                case 99 -> {
                    System.out.println("Thanks for visiting Restau!");
                    isRunning = false;
                }
            default -> System.out.println("Wrong input. Try again");
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
            if (options[i] == "Quit" || options[i] == "Cancel") {
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
    
    
    private static void menuPortal() {
        String[] options = {"Create Meal", "Create Drink", "Show Menu", "Quit"};
        
        
        String title;
        float price;
        int choice;
        boolean running = true;
        int menuChoice;
        while(running) {
            displayOptions(options, "");
            menuChoice = getUserChoice();
            switch(menuChoice) {
                case 1 -> {
                    title = getStringFromUser("Title");
                    price = getFloatFromUser("Price");

                    displayOptions(MealType.describe(), "Meal type");
                    choice = getUserChoice();

                    Meal meal1 = MenuPortal.createMeal(title, price, choice);
                }
                case 2 -> { 
                    title = getStringFromUser("Title");
                    price = getFloatFromUser("Price");
                    displayOptions(DrinkType.describe(), "Drink type");
                    choice = getUserChoice();

                    Drink drink = MenuPortal.createDrink(title, price, choice);
                }
                case 3 -> System.out.println(MenuPortal.getMenu());
                case 99 -> {
                    System.out.println("Come back soon!");
                    running = false;
                }
                default -> System.out.println("Wrong input. Choose a number");

            }
        }
    }
    
    private static void characterPortal() {
        String[] options = {"Create Customer", "Create Staff"};
        
        String firstname, lastname;
        Sex sex = Sex.NON_BINARY;
        boolean isRunning = true;
        boolean invalidSex = true;
        int menuChoice;
        while (isRunning) {
            firstname = getStringFromUser("first name");
            lastname = getStringFromUser("last name");

            displayOptions(Sex.describe(), "Sex");
            menuChoice = getUserChoice();
            while (invalidSex) {
                switch (menuChoice) {
                    case 1 -> {
                        sex = Sex.FEMALE;
                        invalidSex = false;
                    }
                    case 2 -> {
                        sex = Sex.MALE;
                        invalidSex = false;
                    }
                    case 3 -> {
                        sex = Sex.NON_BINARY;
                        invalidSex = false;
                    }
                    default -> System.out.println("Choose a valid number");
                }
            }
            
            displayOptions(options, "");
            menuChoice = getUserChoice();
            
            switch (menuChoice) {
                case 1 -> {
                    
                    Customer customer = new Customer(firstname, lastname, sex);
                    System.out.println("Created customer: " + customer.getName());
                }
                case 2 -> {
                    String[] staff_options = {"Restaurant Owner", 
                      "Chef", "Barman", "Cook", "Waiter",  "Cancel"
                    };
                    displayOptions(staff_options, "Staff options");
                    menuChoice = getUserChoice();
                    switch (menuChoice) {
                        case 1 -> { 
                            RestaurantOwner owner = new RestaurantOwner(firstname, lastname, sex);
                            System.out.println("Created restaurant owner: " + owner.getName());
                    }
                        case 2 -> { 
                            Chef chef = new Chef(firstname, lastname, sex);
                            System.out.println("Created chef: " + chef.getName());
                    }
                        case 3 -> { 
                            Barman barman = new Barman(firstname, lastname, sex);
                            System.out.println("Created barman: " + barman.getName());
                    }
                        case 4 -> { 
                            Cook cook = new Cook(firstname, lastname, sex);
                            System.out.println("Created cook: " + cook.getName());
                    }
                        case 5 -> {
                            Waiter waiter = new Waiter(firstname, lastname, sex);
                            System.out.println("Created waiter: " + waiter.getName());
                    }
                        case 99 -> {
                            return;
                    }
                        default -> System.out.println("Wrong choice. Try again.");
                    }  
                }
                default -> System.out.println("You entered a wrong input. Try again");
                        
            }
            
            
        }
        
    }
}
