/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restau;

/**
 *
 * @author yawobeng
 */
public abstract class MenuItem {
    private String title;
    private float price;
    private boolean prepared;

    public MenuItem(String title, float price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public boolean isPrepared() {
        return prepared;
    }

    public void setIsPrepared() {
        this.prepared = true;
    }

    @Override
    public String toString() {
        String description = title + " || " + price + "euros";
        return description;
    }
    
    
}
