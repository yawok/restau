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
    
    protected boolean isServed;
    protected boolean isPaid;
    protected Customer customer;
    
    public Order(boolean cooked,boolean isServed , boolean isPaid, Customer customer){
        this.isServed=isServed;
        this.isPaid=isPaid;
        this.customer=customer;
    }
    
    ArrayList<MenuItems> item = new ArrayList<MenuItems>();
    
    
    //Get methods
    
    public boolean getServed(){
        return isServed;
    }
    
    public boolean getPaid(){
        return isPaid;
    }
    
    public Customer getCustomer(){
        return customer;
    }
    
    public float getTotal(float total){
        return total;
    }
    
    
    // Set methods
    
    public boolean setServed(boolean newisServed){
        this.isServed=newisServed;
        return newisServed;
    }
    
    public boolean setPaid(boolean newisPaid){
        this.isPaid=newisPaid;
        return newisPaid;
    }
    
    public Customer setCustomer(Customer newCustomer){
        this.customer=newCustomer;
        return newCustomer;
    }
    
    //public float pay(){
        
    //}
}
