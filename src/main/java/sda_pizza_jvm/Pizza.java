package sda_pizza_jvm;

public class Pizza implements Meal {


    private String name;
    private double price;

    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {


        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Pizza %-15s", name));
        sb.append(" ");
        sb.append(String.format("%.2f", price));
        sb.append("un");

        return sb.toString();
    }
}
