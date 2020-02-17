package com.chitkara.CostPerSqftConstruction;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Area: ");
        double area = sc.nextDouble();
        sc.nextLine();
        printStandardMaterials();
        String material = sc.nextLine().toLowerCase();

        boolean automation = false;
        if(material.contains("high")) {
            System.out.println("Select automation (true/false) : ");
            automation = sc.nextBoolean();

        }

        CalcCostPerConstruction costPerConstruction = new CalcCostPerConstruction();
        costPerConstruction.calculate(area,material,automation);

    }

    public static void printStandardMaterials()
    {
        System.out.println("Choose material: ");
        System.out.println("Type 'standard' for standardMaterial: ");
        System.out.println("Type 'medium' for mediumStandardMaterial: ");
        System.out.println("Type 'high' for highStandardMaterial: ");
    }



}
