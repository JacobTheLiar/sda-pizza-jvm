package sda_pizza_jvm;

import java.util.ArrayList;
import java.util.List;

import static sda_pizza_jvm.ChosenSummary.viewSummary;
import static sda_pizza_jvm.Input.getInt;
import static sda_pizza_jvm.MealPrinter.printMenu;

public class Restaurant {

    List<Meal> meals;
    List<Meal> chosen;

    public void launch() {
        initialize();
        viewMenu();
    }

    private void viewMenu() {

        boolean exit = false;

        do {
            printMenu(meals);
            System.out.println();
            viewSummary(chosen);
            System.out.println();
            System.out.print("Select your pizza: ");
            exit = selectPizzaOrExit(getInt());

        } while (!exit);
    }

    private boolean selectPizzaOrExit(int selectedItem) {

        if (0<selectedItem && selectedItem<=meals.size()){
            Meal selected = meals.get(selectedItem-1);
            chosen.add(selected);
        } else if (selectedItem==0){
            System.out.println("bye!");
        } else {
            System.out.println("incorrect menu position!");
        }

        return selectedItem==0;
    }

    private void initialize() {

        chosen = new ArrayList<>();
        meals = new ArrayList<>();
        meals.add(new Pizza("Swojska", 19.99));
        meals.add(new Pizza("Farmerska", 23.99));
        meals.add(new Pizza("Boczek", 15.99));
        meals.add(new Pizza("Margherita", 11.99));
        meals.add(new Pizza("Meat", 25.99));

    }
}
