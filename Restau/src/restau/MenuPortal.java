/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restau;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author yawobeng
 */
public class MenuPortal {
    
    private static Menu menu = new Menu();
    public MenuPortal() {
    }
    
    public static Meal createMeal(String title, float price, int choice, boolean save) {
        System.out.println("createing mealll");
        MealType mealtype;
        switch (choice) {
            case 1:
                mealtype = MealType.BREAKFAST;
                break;
            case 2:
                mealtype = MealType.LUNCH;
                break;
            case 3:
                mealtype = MealType.SUPPER;
                break;
            default:
                mealtype = MealType.BREAKFAST;
                break;
        }
        System.out.println(mealtype);
        Meal meal = new Meal(title, price, mealtype);
        System.out.println("Meal created: " + meal);
        if(save) meal.saveToFile(title, price);
        menu.addToMenu(meal);
        return meal;
        
    }
    
    public static Drink createDrink(String title, float price, int choice, boolean save) {
        DrinkType drinktype;
        switch (choice) {
            case 1:
                drinktype = DrinkType.ALCOHOLIC;
                break;
            case 2:
                drinktype = DrinkType.NON_ALCOHOLIC;
                break;
            default:
                drinktype = DrinkType.NON_ALCOHOLIC;
                break;
        }
        
        Drink drink = new Drink(title, price, drinktype);
        menu.addToMenu(drink);
        if(save) drink.saveToFile(title, price);
        System.out.println("Drink created: " + drink);
        return drink;
    }

    public static void loadFromFile() {
        final String MENUFILE = "menu_file.csv";
        ArrayList<String> records = new ArrayList();
        String[] record = null;
        
        try(BufferedReader reader = new BufferedReader(new FileReader(MENUFILE))){
            String line;
            while ((line = reader.readLine()) != null) {
                
                records.add(line);
                
                
            }
        } catch (IOException e) {
            System.out.println("An error occured while reading the file.");
        }
        
        for (String line : records){
            System.out.println(line);
            record = line.split(",");
            System.out.println(record[0]);
            if (record[0].equals("meal")) {
                MenuPortal.createMeal(record[1], Float.parseFloat(record[2]), Integer.parseInt(record[3]), false);
            } else if (record[0].equals("drink")) {
                MenuPortal.createDrink(record[1], Float.parseFloat(record[2]), Integer.parseInt(record[3]), false);
            } else {
                System.out.println("something went wrong");
            }
        }
    }
    public static Menu getMenu() {
        return menu;
    }
}
