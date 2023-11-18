/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package restau;

/**
 *
 * @author yawobeng
 */
public enum MealType {
    BREAKFAST("Breakfast"), LUNCH("Lunch"), SUPPER("Supper");  
    
    public String description;
    MealType(String description) {
        this.description = description;
    }
    
    public static String[] describe() {
        String[] descriptions = {BREAKFAST.toString(),
                                LUNCH.toString(),
                                SUPPER.toString()
        };
        return descriptions;
    }
    
    @Override
    public String toString() {
        return description;
    }
}
