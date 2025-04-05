package org.academy.kata.implementation.MMykha;

import org.academy.kata.Base;
import org.academy.kata.IFive;

import java.math.BigInteger;

public class FiveImpl extends Base implements IFive {
    @Override
    public long[] gap(int g, long m, long n) {
        return new long[0];
    }

    @Override
    public int zeros(int n) {
        return 0;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        return null;
    }

    @Override
    public double solve(double m) {
        double diffComp = 1e-12;
        int n = 20000;
        double start = 0.0;
        double end = 1.0;

        while(end-start>diffComp){
            double x = (start+end)/2;
            double sumU = 0.0;
            double powerX = x;
            for(int k =1; k<=n; k++){
                sumU += (k*powerX);
                powerX *= x;
            }
            if(sumU<m) start = x;
            else end = x;
        }
        return (start+end)/2;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
