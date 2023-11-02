/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restau;

/**
 *
 * @author yawobeng
 */
public enum Sex {
    MALE ("Male"),
    FEMALE ("Female"),
    NON_BINARY ("non-binary");
    
    private String description;
    private Sex(String description) {
        this.description = description;
    }
    
    public String toString() {
        return description;
    }
}
