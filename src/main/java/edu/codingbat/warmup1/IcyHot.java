package edu.codingbat.warmup1;

/**
 * Given two temperatures, return true if one is less than 0 and the other is greater than 100.
 *
 *
 * icyHot(120, -1) → true
 * icyHot(-1, 120) → true
 * icyHot(2, 120) → false
 */

public class IcyHot {
    public boolean icyHot(int temp1, int temp2) {
        if ((temp1<0 && temp2>100) || (temp1>100 && temp2<0)){
            System.out.println("true");
            return true;
        }
        else{
            System.out.println("false");
            return false;
        }
    }
}
