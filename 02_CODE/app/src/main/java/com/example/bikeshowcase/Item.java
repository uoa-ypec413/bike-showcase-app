package com.example.bikeshowcase;

import java.io.Serializable;
import java.util.List;

public class Item implements Serializable {
    String itemTitle, description, colour;
    String[] imageFileNameList;
    Integer price;

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

    public Item(String itemTitle, String description, String colour, String[] imageFileNameList, Integer price){
        this.itemTitle = itemTitle;
        this.imageFileNameList = imageFileNameList;
        this.description = description;
        this.colour = colour;
        this.price = price;
    }
}
