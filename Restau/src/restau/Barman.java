/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restau;

/**
 *
 * @author yawobeng
 */
public final class Barman extends Staff {

    public Barman(String firstName, String lastName, Sex sex) {
        super(firstName, lastName, sex);
    }
    
    private CoinPurse cashRegister = new CoinPurse();

    public CoinPurse getCashRegister() {
        return cashRegister;
    }

    
    public void collectCash(float cash) {
        float cashRegisterBalance = this.getCashRegister().getBalance();
        float newBalance = cashRegisterBalance + cash;
        this.cashRegister.setBalance(newBalance);
    }
    
    
    public void prepareDrink(Order order) {
        for (MenuItem item : order.getItems()) {
            if (item instanceof Drink){
                Drink drink = (Drink) item;
                System.out.println("I am preparing the " + drink + " drink)");
                drink.setIsPrepared();
                this.increasePopularity();
            }
        }
        
    }
}
