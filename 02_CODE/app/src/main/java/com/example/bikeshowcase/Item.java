package com.example.bikeshowcase;

import java.util.List;

public class Item {
    String itemTitle, description, colour, category;
    String[] imageFileNameList;
    Integer price;

    public String getCategory() { return category; }

    public String getItemTitle() {
        return itemTitle;
    }

    public String[] getImageFileNameList() {
        return imageFileNameList;
    }

    public String getDescription() {
        return description;
    }

    public String getColour() {
        return colour;
    }

    public Integer getPrice() {
        return price;
    }

    public Item setCategory(String category) {
        this.category = category;
        return this;
    }

    public Item setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
        return this;
    }

    public Item setDescription(String description) {
        this.description = description;
        return this;
    }

    public Item setColour(String colour) {
        this.colour = colour;
        return this;
    }

    public Item setPrice(Integer price) {
        this.price = price;
        return this;
    }

    public Item setImageFileNameList(String[] imageFileNameList) {
        this.imageFileNameList = imageFileNameList;
        return this;
    }

    public Item(){
        this.itemTitle = "Title";
        this.description = "Description";
        this.colour = "Colour";
        this.price = 999;
    }
    public Item(String itemTitle, String description, String colour, String[] imageFileNameList, Integer price){
        this.itemTitle = itemTitle;
        this.imageFileNameList = imageFileNameList;
        this.description = description;
        this.colour = colour;
        this.price = price;
    }
}
