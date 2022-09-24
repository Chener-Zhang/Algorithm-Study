package com.company.RecursionAlgorithm;

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

    // Long version
//    public Integer calculate_power(Long a, Long b) {
//        // Write your code here.
//        if (b < 0) {
//            a = 1 / a;
//        }
//
//        return helper(a, b);
//    }
//
//    public Integer helper(Long a, Long b) {
//        if (a == 0) return 0;
//        if (b == 0) return 1;
//        int res = helper(a, b / 2);
//        res = res * res;
//
//        if (b % 2 == 0) {
//            return res;
//
//        } else {
//            return (int) (res * a);
//        }
//    }

}
