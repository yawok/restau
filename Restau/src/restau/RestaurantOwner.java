/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restau;

/**
 *
 * @author yawobeng
 */
public class RestaurantOwner extends Staff implements IsManager {

    public RestaurantOwner(String firstName, String lastName, Sex sex) {
        super(firstName, lastName, sex);
        super.setPopularity(100);
    }

    @Override
    public void collectCash(Staff staff) {
        if (staff instanceof Barman) {
            Barman barman = (Barman) staff;
            float cashRegisterBalance = barman.getCashRegister().getBalance();
            this.getCoinPurse().setBalance(cashRegisterBalance);
            barman.getCashRegister().setBalance(0);
        } else if (staff instanceof Chef) {
            Chef chef = (Chef) staff;
            float chefsPurse = chef.getCoinPurse().getBalance();
            this.getCoinPurse().setBalance(chefsPurse);
            chef.getCoinPurse().setBalance(0);
        }
    }
    

    @Override
    public void throwOut(Character character) {
        if (character instanceof Customer) {
            Customer customer = (Customer) character;
            if (customer.isOwing()) {
                CoinPurse customerPurse = customer.getCoinPurse();
                this.getCoinPurse().setBalance(customerPurse.getBalance());
                customerPurse.setBalance(0);
                System.out.println("Now get out of here " + customer.getName() + "!!");
            } 
        } else if (character instanceof Staff) {
            Staff staff = (Staff) character;
            if (staff instanceof Barman) {
                Barman barman = (Barman) staff;
                this.collectCash(barman);
            }
            System.out.println("Now get out of here " + staff.getName() + "!!");
                
        }
        character.setTrownOut();
    }
    
    
}
