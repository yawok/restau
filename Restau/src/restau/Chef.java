/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restau;

/**
 *
 * @author yawobeng
 */
public class Chef extends Staff implements IsManager{
    
    public Chef(String firstName, String lastName, Sex sex) {
        super(firstName, lastName, sex);
    }
    
    public void yellAt(Staff staff) {
        if (staff instanceof Waiter || staff instanceof Cook) {
            staff.decreasePopularity();
            String name = staff.getName();
            System.out.println("Hey " + name + "!" + "You are making me angry!"
                    + "Do your job!!!");
            if (staff.getPopularity() >= 0) {
                this.throwOut(staff);
            }
        }
        
    }

    @Override
    public void collectCash(Staff staff) {
        if (staff instanceof Barman) {
            Barman barman = (Barman) staff;
            float cashRegisterBalance = barman.getCashRegister().getBalance();
            this.getCoinPurse().setBalance(cashRegisterBalance);
            barman.getCashRegister().setBalance(0);
        }
    }

    @Override
    public void throwOut(Character character) {
        if (character instanceof Staff) {
            Staff staff = (Staff) character;
            staff.setTrownOut();
            CoinPurse customerPurse = staff.getCoinPurse();
            this.getCoinPurse().setBalance(customerPurse.getBalance());
            customerPurse.setBalance(0);
            System.out.println("Now get out of here " + staff.getName() + "!!");
        }
    }
    
}
