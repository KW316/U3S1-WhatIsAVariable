package com.codedifferently.lab.partB;
import java.util.Arrays;

public class Coin {
    String name;
    double value;

    public Coin(String x, double y) {
        name = x;
        value = y;
    }

    public Coin() {
        name = "Penny";
        value = .01;


    }

    public String toString() {
        return "Coin{name='" + name + "', value=" + value + "}";
    }
    public String getName(){
        return name;
    }
    public double getValue(){
        return value;
    }

    public String Sort(Coin obj1, Coin obj2, Coin obj3, Coin obj4, Coin obj5) {
        double[] arr = {obj1.value, obj2.value, obj3.value, obj4.value, obj5.value};
        String[] arrs = {obj1.name, obj2.name, obj3.name, obj4.name, obj5.name};
        double swap;
        String swaps;
        int pennies = 0;
        int dimes = 0;
        int nickels = 0;
        int quarters = 0;
        for( int i = 1; i < arr.length; i++){
            if (arr[i] < arr[i-1]){
                swap = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = swap;
                swaps = arrs[i];
                arrs[i] = arrs[i-1];
                arrs[i-1] = swaps;
            }else{

            }

        }
        for( int i = 0; i < arrs.length; i++){
            if(arrs[i].equalsIgnoreCase("quarters")){
                quarters++;
            }else if(arrs[i].equalsIgnoreCase("dime")){
                dimes++;
            }else if(arrs[i].equalsIgnoreCase("nickel")){
                nickels++;
            }else{
                pennies++;
            }
        }

        return "You have " + pennies + " pennies, " + nickels + " nickels, " + dimes + " dime, and " + quarters + " quarters";
    }
}

