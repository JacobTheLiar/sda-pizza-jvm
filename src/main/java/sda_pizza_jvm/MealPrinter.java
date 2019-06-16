package sda_pizza_jvm;

import java.util.List;

public class MealPrinter {


    public static void printMenu(List<Meal> dishes) {

        StringBuilder sb = new StringBuilder();

        sb.append("meal list: \n");

        int couter = 0;

        for (Meal meal : dishes) {
            couter++;
            sb.append(String.format("%3d. %30s\n", couter, meal));
        }

        System.out.println(sb);
    }

}
