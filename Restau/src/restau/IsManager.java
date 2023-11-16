/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package restau;

/**
 *
 * @author yawobeng
 */
public interface IsManager {
    public void collectCash(Staff staff);
    
    public void throwOut(Character character);
    // throwOut will collect all their cash and set their table to null or something
}
