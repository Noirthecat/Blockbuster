package com.company;

import com.company.customer.Customer;
import com.company.product.*;


public class Main {

    public static void main(String[] args) {
        BlockBuster blockBuster = new BlockBuster();
        blockBuster.addProduct(new Movie("Terminator",1994,5,20) );
        blockBuster.addProduct(new Movie("Grown Ups 2",2010,9,21) );
        blockBuster.addProduct(new Movie("Grown Ups",2008,5,17) );
        blockBuster.addProduct(new Movie("Crocodile Dundee",1997,4,22) );
        blockBuster.addProduct(new Movie("Indiana Jones",1999,5,20) );
        blockBuster.addProduct(new Movie("Back to the future",1992,3,15) );
        blockBuster.addProduct(new Movie("Men in Black",2007,8,19) );
        blockBuster.addProduct(new Movie("Harry Potter and the Deathly Hollows",2011,8,25) );
        blockBuster.addProduct(new VideoGame("Harry Potter and the Deathly Hollows",2012,9,28) );
        blockBuster.addProduct(new VideoGame("Harry Potter and the Half Blood Prince",2007,6,23) );
        blockBuster.addProduct(new VideoGame("World of Warcraft",2006,5,30) );
        blockBuster.addProduct(new VideoGame("Counter Strike Global Offensive",2011,5,20) );
        blockBuster.addProduct(new VideoGame("Call of Duty",2017,8,28) );
        blockBuster.addProduct(new VideoGame("Ori and the will of the whips",2018,7,25) );
        blockBuster.addProduct(new VideoGame("Ori and the Bling Forest",2014,5,20) );
        blockBuster.addProduct(new VideoGame("Life is Strange",2017,7,22) );
        blockBuster.addProduct(new Music("Green Day",2011,4,21) );
        blockBuster.addProduct(new Music("Linking Park",2010,2,20) );
        blockBuster.addProduct(new Music("Nina Kravitz",2020,10,30) );
        blockBuster.addProduct(new Music("Eminem",2017,7,22) );
        blockBuster.addProduct(new Music("Bon Jovi",2006,2,15) );
        blockBuster.addProduct(new Music("Lofi",2009,2,8) );
        blockBuster.addProduct(new TVShow("Modern Family",2009,2,8) );
        blockBuster.addProduct(new TVShow("Simpsons",2009,2,8) );
        blockBuster.addProduct(new TVShow("Dark",2009,2,8) );
        blockBuster.addProduct(new TVShow("Friends",2009,2,8) );
        blockBuster.addProduct(new TVShow("Disenchantment",2009,2,8) );
        blockBuster.addProduct(new TVShow("Babylon Berlin",2017,2,8) );

        System.out.println(blockBuster.getProducts());
        Customer customer = new Customer();
        for (int i = 0; i < 7 ; i++) {
            if (customer.comingIn() <= 75) {
                blockBuster.rentOrBuyProduct();
                blockBuster.endOfRentingDuration();
                blockBuster.blockBusterFavourite();
            }
        }
        System.out.println(blockBuster.getProducts());
        System.out.println(blockBuster.getMonthlyRevenue());
    }
}