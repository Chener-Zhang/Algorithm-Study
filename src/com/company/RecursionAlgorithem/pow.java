package com.company.RecursionAlgorithem;

public class pow {
    public double myPow(double x, int n) {
        if (n < 0) {
            x = 1 / x;
            return helper(x, n);
        }
        return helper(x, n);
    }

    public double helper(double x, int n) {
        if (x == 0) return 0;
        if (n == 0) return 1;
        double res = helper(x, n / 2);
        if (n % 2 == 0) {
            return res * res;
        } else {
            return res * res * x;
        }
    }
}
