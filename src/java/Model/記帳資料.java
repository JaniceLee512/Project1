/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public class 記帳資料 {
     private String name;
     private String product;
     private int price;
     private int number;
     private int total;

    public 記帳資料() {
    }

    public 記帳資料(String name, String product, int price, int number, int toatl) {
        this.name = name;
        this.product = product;
        this.price = price;
        this.number = number;
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "記帳資料:{" + "name=" + name + ", product=" + product + ", price=" + price + ", number=" + number + ", total=" + total + '}';
    }

  

    
   

}
