/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restau;

import java.util.Scanner;

/**
 *
 * @author yawobeng
 */
public class MenuPortal {
    
    private static Menu menu = new Menu();
    public MenuPortal() {
    }
    
    public static Meal createMeal(String title, float price, int choice) {
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
        System.out.println(meal);
        menu.addToMenu(meal);
        return meal;
        
    }
    
    public static Drink createDrink(String title, float price, int choice) {
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
        return drink;
    }

    public static Menu getMenu() {
        return menu;
    }
}
