/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restau;
import java.util.ArrayList;
/**
 *
 * @author Administrateur
 */
public class Order {
    
    private boolean served;
    private boolean paid;
    private boolean consumed;
    private Character character;
    private ArrayList<MenuItem> items;
    private static ArrayList<Order> orders = new ArrayList<Order>();
    
    
    public Order(boolean cooked, boolean isServed, boolean isPaid, Character character){
        try {
            if (character.isTrownOut()) {
                throw new Exception(character.getName() + "This character is not"
                        + " allowed in the restaurant.");
            } else {
                this.served=isServed;
                this.paid=isPaid;
                this.character = character;
                items = new ArrayList<MenuItem>();
                orders.add(this);
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public Order(Character character) {
        try {
            if (character.isTrownOut()) {
                throw new Exception(character.getName() + "This character is not"
                        + " allowed in the restaurant.");
            } else {
                this.served = false;
                this.paid = false;
                this.consumed = false;
                this.character = character;
                this.items = new ArrayList<MenuItem>();
                orders.add(this);
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    public static ArrayList<Order> getOrders() {
        return orders;
    }
    
    
    public boolean isServed() {
        return served;
    }

    public void setServed() {
        this.served = true;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public float getTotal() {
        Float total = 0f;
        System.out.println("length " + items.size());
        for (MenuItem item : items){
            total += item.getPrice();
        }
        return total;
    }

    public boolean isConsumed() {
        return consumed;
    }

    public void setConsumed() {
        if (this.isServed()){
            this.consumed = true;
        }
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }
    
    public void addItem(MenuItem item) {
        this.items.add(item);
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }
    
    public void pay(Barman barman) {
        float customerBalance = character.getCoinPurse().getBalance();
        float total = this.getTotal();
        
        if (served) {
            if (customerBalance >= total) {
                float newBalance = customerBalance - total;
                character.getCoinPurse().setBalance(newBalance);
                barman.collectCash(total);
                this.setPaid(true);
            } else {
                System.out.println("You do not have enough money to pay for the"
                        + " order");
                System.out.println("Please find money to pay or else the "
                        + "restaurant owner will throw you out.");
                // implement throwing out or something
            }
        }
    }
    
    @Override
    public String toString() {
        int itemCount = items.size();
        String orderName = "";
        for (int i = 0; i < itemCount; i++) {
            orderName += items.get(i).getTitle();
            if (i != (itemCount - 1)) {
                orderName += ", ";
            }
        }
        return orderName;
    }
    
}
