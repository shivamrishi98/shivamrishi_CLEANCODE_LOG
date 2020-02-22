package com.chitkara.CostPerSqftConstruction;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class App {

    private static Logger LOGGER = LogManager.getLogger(App.class);

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        LOGGER.info("Enter Area: ");

        double area = sc.nextDouble();
        sc.nextLine();
        printStandardMaterials();
        String material = sc.nextLine().toLowerCase();

        boolean automation = false;
        if(material.contains("high")) {
            LOGGER.info("Select automation (true/false) : ");

            automation = sc.nextBoolean();

        }

        CalcCostPerConstruction costPerConstruction = new CalcCostPerConstruction();
        costPerConstruction.calculate(area,material,automation);

    }

    public static void printStandardMaterials()
    {
        LOGGER.info("Choose material: ");
        LOGGER.info("Type 'standard' for standardMaterial:  ");
        LOGGER.info("Type 'medium' for mediumStandardMaterial: ");
        LOGGER.info("Type 'high' for highStandardMaterial: ");



    }



}
