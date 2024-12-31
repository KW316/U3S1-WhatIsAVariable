package com.codedifferently.lab.partB;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Coin coin1 = new Coin();
        Coin coin2 = new Coin("Quarter", .25);
        Coin coin3 = new Coin("Dime", .10);
        Coin coin4 = new Coin("Penny", .01);
        System.out.println(coin1);
        System.out.println(coin2);
        System.out.println(coin3);
        System.out.println(coin4);
        coin1 = new Coin();
        coin2 = new Coin("Quarter", .25);
        coin3 = new Coin("Dime", .10);
        coin4 = new Coin("Quarter", .25);
        Coin coin5 = new Coin("Penny", .01);
        Coin coin = new Coin("test", 0.0);

        System.out.println(coin.Sort(coin1, coin2, coin3, coin4, coin5));


    }
}

