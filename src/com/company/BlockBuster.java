package com.company;

import com.company.customer.Customer;
import com.company.product.*;

import java.util.ArrayList;
import java.util.List;

public class BlockBuster {
    private int monthlyRevenue;
    Customer customer = new Customer();
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public int getMonthlyRevenue() {
        return monthlyRevenue;
    }

    public void rentOrBuyProduct(){
        for (int i = 0; i < products.size() ; i++) {
            if(!products.get(i).isAvailableForPurchase()){
                if(products.get(i).isAvailable()){
                    products.get(i).setAvailable(false);
                    monthlyRevenue += products.get(i).getDailyRentalCost();
                    products.get(i).getPlatform();
                    products.get(i).setRentedFor(customer.renting());
                    break;
                }
            }else{
                monthlyRevenue += products.get(i).getOriginalRetailPrice();
                products.remove(i);
            }
        }
    }

    public void endOfRentingDuration() {
        for (int i = 0; i < products.size() ; i++) {
            if(!products.get(i).isAvailable()){
                products.get(i).setRentedFor(products.get(i).getRentedFor() - 1);
            }
            if (products.get(i).getRentedFor() == 0){
                products.get(i).setAvailable(true);
                products.get(i).setPopular(1);
            }
        }
    }

    public void blockBusterFavourite() {
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getPopular() == 2){
                products.get(i).setAvailableForPurchase(true);
            }
        }
    }
}
