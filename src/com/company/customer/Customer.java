package com.company.customer;

import com.company.util.RandomUtils;

public class Customer {
    private final int MINDAY = 3;
    private final int MAXDAY = 14;
    private final int CHANCEOFCOMINGIN = 101;


    public int renting(){
        return RandomUtils.generateNumberBetween(MINDAY,MAXDAY);
    }

    public int comingIn(){
         return RandomUtils.RANDOM.nextInt(CHANCEOFCOMINGIN);
    }
}
