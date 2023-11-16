/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restau;

/**
 *
 * @author yawobeng
 */
public class Drink extends MenuItem {
    
    private DrinkType drinkType;
    public Drink(String title, Integer price, DrinkType drinkType) {
        super(title, price);
        this.drinkType = drinkType;
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(DrinkType drinkType) {
        this.drinkType = drinkType;
    }
    
    @Override 
    public String toString() {
        return this.getTitle();
    }
    
}
