package com.chitkara.CostPerSqftConstruction;

public class CalcCostPerConstruction extends materialCost {

    public void calculate(double area,String material,boolean automation) {

        if (material.contains("standard")) {
            print(area * getStandardMaterial());
        } else if (material.contains("medium")) {
           print(area * getMediumMaterial());
        } else if (material.contains("high") && !automation) {
          print(area * getHighMaterial());
        } else if (material.contains("high")) {
            print(area * getHighMaterialAndAutomated());
        }

    }

    private void print(double result)
    {
        System.out.println(result);
    }
}
