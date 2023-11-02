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
    private Integer price;
    private boolean isPrepared;

    public MenuItem(String title, Integer price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public boolean isIsPrepared() {
        return isPrepared;
    }

    public void setIsPrepared(boolean isPrepared) {
        this.isPrepared = isPrepared;
    }

    @Override
    public String toString() {
        String description = "Title: " + title + "/n Price: " + price;
        return description;
    }
    
    
}
