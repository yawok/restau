/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restau;

import java.util.ArrayList;

/**
 *
 * @author yawobeng
 */
public abstract class Staff extends Character {
    
    private int popularity;

    public Staff(String firstName, String lastName, Sex sex) {
        super(firstName, lastName, sex);
        this.popularity = 5;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }
    
    public void increasePopularity() {
        popularity++;
    }
    
    public void decreasePopularity() {
        popularity--;
    }
    
    public Order takeOrder(Character character, ArrayList<MenuItem> items){
        Order order = new Order(character);
        order.setItems(items);
        return order;
    }
    
    public void deliverOrder(Order order) {
        order.setServed();
        System.out.println("Here is your order " + order.getCharacter());
    }
}
