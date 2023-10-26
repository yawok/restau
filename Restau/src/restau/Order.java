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
    
    protected boolean cooked;
    protected boolean served;
    protected boolean paid;
    protected char customer;
    
    public Order(boolean cooked,boolean served , boolean paid, char customer){
        this.cooked=cooked;
        this.served=served;
        this.paid=paid;
        this.customer=customer;
    }
    
    ArrayList<Menu> item = new ArrayList<Menu>();
    
    
    //Get methods
    public boolean getCooked(){
        return cooked;
    }
    
    public boolean getServed(){
        return served;
    }
    
    public boolean getPaid(){
        return paid;
    }
    
    public char getCustomer(){
        return customer;
    }
    
    public float getTotal(float total){
        return total;
    }
    
    
    // Set methods
    public boolean setCooked(boolean newCooked){
        this.cooked=newCooked;
        return newCooked;
    }
    
    public boolean setServed(boolean newServed){
        this.served=newServed;
        return newServed;
    }
    
    public boolean setPaid(boolean newPaid){
        this.paid=newPaid;
        return newPaid;
    }
    
    public char setCustomer(char newCustomer){
        this.customer=newCustomer;
        return newCustomer;
    }
    
    //public float pay(){
        
    //}
}
