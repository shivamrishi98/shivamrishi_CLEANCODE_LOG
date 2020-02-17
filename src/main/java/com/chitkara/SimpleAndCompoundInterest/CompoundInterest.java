package com.chitkara.SimpleAndCompoundInterest;

public class CompoundInterest extends Interest {
    public CompoundInterest(double principal, double rate, double time) {
        super(principal, rate, time);
    }

    public double CalcCompoundInterest() {
       double res = principal * Math.pow(1+rate/100.0,time);

       return res;
    }

}
