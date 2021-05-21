package com.example.bikeshowcase;

public class Item {
    String itemTitle, imageFileName, description, colour;
    Float price;

    public String getItemTitle() {
        return itemTitle;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public String getDescription() {
        return description;
    }

    public String getColour() {
        return colour;
    }

    public Float getPrice() {
        return price;
    }

    public Item(String itemTitle, String imageFileName, String description, String colour, Float price){
        this.itemTitle = itemTitle;
        this.imageFileName = imageFileName;
        this.description = description;
        this.colour = colour;
        this.price = price;
    }
}
