/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restau;

/**
 *
 * @author yawobeng
 */
public class Cook extends Staff{

    public Cook(String firstName, String lastName, Sex sex) {
        super(firstName, lastName, sex);
    }
    
    public void cook(Order order) {
        for (MenuItem item : order.getItems()) {
            if (item instanceof Meal) {
                Meal meal = (Meal) item;
                System.out.println("I am making the " + meal);
                item.setIsPrepared();
                this.increasePopularity();
            }
        }
    }
    
}
