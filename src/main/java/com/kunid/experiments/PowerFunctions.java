package com.kunid.experiments;

public class PowerFunctions {

    /**
     * Recursively compute the power of base X to power Y - without using any libraries
     * @param base
     * @param power
     * @return
     */
    public static double compute (int base, int power) {
        if (power < 0) {
            return  (1.0/base) * compute(base, power + 1) ;
        }
        else if (power == 0) {
            return 1;
        }
        else if (power == 1) {
            return base;
        }
        else {
            return base * compute(base, power -1);
        }
    }
}
