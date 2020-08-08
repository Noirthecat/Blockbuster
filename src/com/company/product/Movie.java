package com.company.product;

public class Movie extends Product{
    public Movie(String title, int releaseDate, int dailyRentalCost, int originalRetailPrice) {
        super(title, releaseDate, dailyRentalCost, originalRetailPrice);
    }

    @Override
    public void getPlatform() {
        super.getPlatform();
    }

}
