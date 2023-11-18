/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package restau;

/**
 *
 * @author yawobeng
 */
public enum DrinkType {
    ALCOHOLIC("Alcoholic"), NON_ALCOHOLIC("Non-alcoholic");
    
    String description;
    
    DrinkType(String description) {
        this.description = description;
    }
    
    public static String[] describe() {
        String[] description = {ALCOHOLIC.toString(), NON_ALCOHOLIC.toString()};
        return description;
    }
    
    @Override 
    public String toString() {
        return description;
    }
    
    
}
