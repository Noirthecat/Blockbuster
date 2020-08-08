package com.company.util;

import java.util.Random;

public class RandomUtils {
   public static final Random RANDOM = new Random();


    public static int generateNumberBetween(int min, int max){
        return (min) + (int)(Math.random()* ( max - min + 1));
    }
}
