package sda_pizza_jvm;

import java.util.List;

public class ChosenSummary {


    public static void viewSummary(List<Meal> chosen){

        double sum = 0.0;

        for (Meal meal : chosen )
            sum += meal.getPrice();
        System.out.println(String.format("Summary of %d items in price %.2fun", chosen.size(), sum));

    }

}
