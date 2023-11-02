/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package restau;

import java.util.List;

/**
 *
 * @author yawobeng
 */
public abstract class Character {
    private String firstName;
    private String lastName;
    private CoinPurse coinPurse;
    private Sex sex;
    private List<Order> orders;

    public Character(String firstName, String lastName, CoinPurse coinPurse, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.coinPurse = coinPurse;
        this.sex = sex;
    }
    
    public CoinPurse getCoinPurse() {
        return coinPurse;
    }

    public void setCoinPurse(CoinPurse coinPurse) {
        this.coinPurse = coinPurse;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
    
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
    
    public void eat(Order order /* meal instead */) {
        if (this.orders.contains(order)) {
            if (order.cooked) {
                System.out.println("I am eating my meal(" 
                        + order.toString() + ") now.");
                //order.setEaten();
            } else {
                System.out.println("This is not the meal I ordered.");
            }
        }
    }
    
    public void giveOrder(Order ... orders) {
        System.out.println("I would like to order :");
        for (Order order : orders) {
            this.orders.add(order);
            System.out.println(order.toString());
        }
    }
    
    public void talk(String something) {
        System.out.println(something);
    }
    
    /*
    public void drink(Order order) {
        if (order.instanceof(Drink)) {
            System.out.println("I am enjoying this " + order.toString() + " drink.");
            //order.setConsumed;
        }
        
    }*/
    
    
}
