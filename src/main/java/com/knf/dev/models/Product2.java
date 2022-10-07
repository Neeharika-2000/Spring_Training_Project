package com.knf.dev.models;

import javax.persistence.*;

@Entity
@Table(name="product_two")

public class Product2 {
    @Id
    @SequenceGenerator(name = "product2_sequence",
            sequenceName = "product2_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY,
            generator = "product2_sequence"
    )
    private long id;
    private String product2_name;
    private int price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product2_name;
    }

    public void setProduct_name(String product2_name) {
        this.product2_name = product2_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    private int quantity;

    public Product2(long id, String product2_name, int price, int quantity, String image) {
        this.id = id;
        this.product2_name = product2_name;
        this.price = price;
        this.quantity = quantity;
        this.image = image;
    }
    public Product2(){

    }

    private String image;
}
