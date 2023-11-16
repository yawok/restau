/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restau;

/**
 *
 * @author yawobeng
 */
public class Customer extends Character {
    private Table table;
    private boolean isOwing;

    public Customer(String firstName, String lastName, Sex sex, Table table) {
        super(firstName, lastName, sex);
        this.table = table;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public boolean isOwing() {
        return isOwing;
    }

    public void setIsOwing(boolean isOwing) {
        this.isOwing = isOwing;
    }
     
    @Override
    public void talk(String something) {
        super.talk(something);
        System.out.println("I am really enjoying this restaurant and the meals");
    }
    
}
