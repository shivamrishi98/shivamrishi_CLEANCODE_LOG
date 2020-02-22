package com.chitkara.CostPerSqftConstruction;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CalcCostPerConstruction extends materialCost {


    private static Logger LOGGER = LogManager.getLogger(App.class);

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
   LOGGER.info(result);
    }
}
