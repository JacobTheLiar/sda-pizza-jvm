package sda_pizza_jvm.visual_vm;

import static sda_pizza_jvm.Input.getInt;

public class Main {

    public static void main(String[] args) {

        MyReader loremReader = new LoremReader();
        Concatenate concatenate = new Concatenate(loremReader);

        System.out.println("do it");
        getInt();
        System.out.println(concatenate.withPlus());


        System.out.println("do it");
        getInt();
        System.out.println(concatenate.withBuilder());
        getInt();

    }

}
