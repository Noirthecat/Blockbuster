package com.company.product;

public abstract class Product {
    private boolean available = true;
    private String title;
    private static int releaseDate;
    private int dailyRentalCost;
    private int originalRetailPrice;
    private int rentedFor;
    private int popular;
    private boolean availableForPurchase = false;

    public void setAvailableForPurchase(boolean availableForPurchase) {
        this.availableForPurchase = availableForPurchase;
    }

    public int getPopular() {
        return popular;
    }

    public Product(String title, int releaseDate, int dailyRentalCost, int originalRetailPrice) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.dailyRentalCost = dailyRentalCost;
        this.originalRetailPrice = originalRetailPrice;
        this.getPlatform();
    }

    public boolean isAvailableForPurchase() {
        return availableForPurchase;
    }

    public void setPopular(int popular) {
        this.popular = this.popular + popular;
    }

    public void getPlatform(){
        Platform platform;
        if(getClass().getSimpleName().equals("Music")){
            platform = Platform.CD;
        }
        else if(getClass().getSimpleName().equals("VideoGame")){
            platform = Platform.DVD;
        }
        else if(releaseDate < 2000){
            platform = Platform.VHS;
        }
        else if ( releaseDate < 2010 && releaseDate > 2000){
            platform = Platform.DVD;
        }
        else if (releaseDate > 2010){
            platform = Platform.BLUERAY;
        }
    }

    public void setRentedFor(int rentedFor) {
        this.rentedFor = rentedFor;
    }

    public int getDailyRentalCost() {
        return dailyRentalCost;
    }

    public int getRentedFor() {
        return rentedFor;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getOriginalRetailPrice() {
        return originalRetailPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", dailyRentalCost=" + dailyRentalCost +
                ", originalRetailPrice=" + originalRetailPrice +
                '}';
    }
}
