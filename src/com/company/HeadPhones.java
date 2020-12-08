package com.company;

public class HeadPhones implements Comparable<HeadPhones> {
    private String title;
    private String brand;
    private double price;
    private double rating;

    public HeadPhones(String title, String brand, double price, double rating){
        this.brand=brand;
        this.title=title;
        this.price=price;
        this.rating=rating;
    }
    public String getTitle(){
        return title;
    }
    public String getBrand(){
        return brand;
    }
    public double getPrice(){
        return price;
    }
    public double getRating(){
        return rating;
    }

    @Override
    public int compareTo(HeadPhones o) {
        return 0;
    }
}
