/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restau;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author yawobeng
 */
public abstract class MenuItem {
    private static final String MENUFILE = "menu_file.csv";
    private String title;
    private float price;
    private boolean prepared;

    public MenuItem(String title, float price) {
        this.title = title;
        this.price = price;
    }
    
    public MenuItem(String title, float price, boolean save) {
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
    
    
    public void saveToFile(String title, float price) {
        String record = "";
        if (this instanceof Meal) {
            Meal meal = (Meal) this;
            record = "meal," + title + "," + price + ",2";
        } else if (this instanceof Drink) {
            record = "drink," + title + "," + price + ",2";
        }
        
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(MENUFILE, true))) {
            writer.write(record);
            writer.newLine();
            System.out.println("New menu item saved.");
        } catch(IOException e) {
            System.out.println("There was an error while saving menu item.");
        }
    }
    
}
