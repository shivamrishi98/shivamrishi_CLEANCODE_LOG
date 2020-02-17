package com.chitkara.SimpleAndCompoundInterest;

import java.util.Scanner;


public class Calculation
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal: ");
        double principal = sc.nextDouble();
        System.out.println("Enter rate: ");
        double rate = sc.nextDouble();
        System.out.println("Enter time: ");
        double time = sc.nextDouble();

      SimpleInterest simpleInterest = new SimpleInterest(principal,rate,time);
        System.out.println("SIMPLE INTEREST: "+simpleInterest.CalcSimpleInterest());
      CompoundInterest compoundInterest = new CompoundInterest(principal,rate,time);
        System.out.println("COMPOUND INTEREST: "+compoundInterest.CalcCompoundInterest());

    }
}
