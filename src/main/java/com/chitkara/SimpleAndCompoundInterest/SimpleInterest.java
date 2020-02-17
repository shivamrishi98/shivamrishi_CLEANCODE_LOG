package com.chitkara.SimpleAndCompoundInterest;

public class SimpleInterest extends Interest {

    public SimpleInterest(double principal, double rate, double time) {
        super(principal, rate, time);
    }

    public double CalcSimpleInterest()
    {
        double res = (principal * rate * time)/100.0;
    return res;
    }

}
