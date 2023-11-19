/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restau;

/**
 *
 * @author yawobeng
 */
public final class Waiter extends Staff{
    
    
    public Waiter(String firstName, String lastName, Sex sex) {
        super(firstName, lastName, sex);
    }
    
    public void Serve(Order order) {
        boolean allPrepared = true;
        
        for (MenuItem item : order.getItems()) {
            if (item.isPrepared() != true) {
                allPrepared = false;
                break;
            }
        }
        
        if (allPrepared) {
            System.out.println("Serving order to " + order.getCharacter().getName());
            order.setServed();
            this.increasePopularity();
        } else {
            System.out.println("I will serve the order as soon as every item"
                    + " is prepared!");
        } 
    }
    
}
