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
public class Table {
    //ArrayList<Characters> customers = new ArrayList<Characters>();
    
    protected int chairs;
    
    public Table(int chairs){
        this.chairs=chairs;
    }
    
    public int getChairs(){
        return chairs;
    }
    
    public int setChairs(int newChairs){
        this.chairs=newChairs;
        return newChairs;
    }
    
    
}
