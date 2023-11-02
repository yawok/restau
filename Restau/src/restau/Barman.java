/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restau;

/**
 *
 * @author yawobeng
 */
public class Barman extends Staff {
    private CoinPurse cashRegister = new CoinPurse();
    
    public void prepareDrink(Order order) {
        for (MenuItem item :order.item) {
            if (item instanceof Drink){
                Drink drink = (Drink) item;
                System.out.println("I am preparing the " + drink + " drink)");
                drink.setIsPrepared(true);
            }
        }
        if (order.item  ) {
            System.out.println("I am preparing the drink(" + order + ")");
            //order.setPrepared;
            order.pay();
            
        }
    }
}
