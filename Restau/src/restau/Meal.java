/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restau;

/**
 *
 * @author yawobeng
 */
public class Meal extends MenuItem {
    
    private MealType mealType;

    public Meal(String title, Integer price, MealType mealType) {
        super(title, price);
        this.mealType = mealType;
    }

    public MealType getMealType() {
        return mealType;
    }

    public void setMealType(MealType mealType) {
        this.mealType = mealType;
    }
    
    @Override 
    public String toString() {
        return this.getTitle();
    }
    
}
