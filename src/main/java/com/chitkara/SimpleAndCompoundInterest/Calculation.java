package com.chitkara.SimpleAndCompoundInterest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;


public class Calculation
{
    private static Logger LOGGER = LogManager.getLogger(Calculation.class);
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
      LOGGER.info("Enter principal: ");

        double principal = sc.nextDouble();
        LOGGER.info("Enter rate: ");

        double rate = sc.nextDouble();
        LOGGER.info("Enter time: ");

        double time = sc.nextDouble();

      SimpleInterest simpleInterest = new SimpleInterest(principal,rate,time);
        LOGGER.info("SIMPLE INTEREST: "+simpleInterest.CalcSimpleInterest());

      CompoundInterest compoundInterest = new CompoundInterest(principal,rate,time);
        LOGGER.info("COMPOUND INTEREST: "+compoundInterest.CalcCompoundInterest());


    }
}
