/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author LABKOM
 */
public class Product {
private int id;
private String product_code;
private String product_name;
private String product_image;
private int product_category;
private int product_supplier;
private long product_price_s;
private long product_price_b;
private int product_stock;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_image() {
        return product_image;
    }

    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }

    public int getProduct_category() {
        return product_category;
    }

    public void setProduct_category(int product_category) {
        this.product_category = product_category;
    }

    public int getProduct_supplier() {
        return product_supplier;
    }

    public void setProduct_supplier(int product_supplier) {
        this.product_supplier = product_supplier;
    }

    public long getProduct_price_s() {
        return product_price_s;
    }

    public void setProduct_price_s(long product_price_s) {
        this.product_price_s = product_price_s;
    }

    public long getProduct_price_b() {
        return product_price_b;
    }

    public void setProduct_price_b(long product_price_b) {
        this.product_price_b = product_price_b;
    }

    public int getProduct_stock() {
        return product_stock;
    }

    public void setProduct_stock(int product_stock) {
        this.product_stock = product_stock;
    }

}
