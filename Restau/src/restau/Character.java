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
    private Sex sex;
    private boolean trownOut;
    
    private CoinPurse coinPurse = new CoinPurse();

    public Character(String firstName, String lastName, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.trownOut = false;
        this.getCoinPurse().setBalance(25);
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

    
    public String getName() {
        return firstName + " " + lastName;
    }

    public boolean isTrownOut() {
        return trownOut;
    }

    public void setTrownOut() {
        this.trownOut = true;
    }
    
    public void consume(Order order /* meal instead */) {
        if (order.getCharacter() == this) {
            if (order.isServed()) {
                System.out.println("I am eating my meal(" 
                        + order.toString() + ") now.");
                order.setConsumed();
            } else {
                System.out.println("This is not the meal I ordered.");
            }
        }
    }
    
    public Order giveOrder(MenuItem ...items) {
        Order order = new Order(this);
        System.out.println("I would like to order :");
        for (MenuItem item : items) {
            order.addItem(item);
            System.out.println(order.toString());
        }
        return order;
    }
    
    public void talk(String something) {
        System.out.println(something);
    }
    
    @Override
    public String toString() {
        return getName();
    }
}
