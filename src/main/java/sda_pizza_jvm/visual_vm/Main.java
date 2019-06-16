package sda_pizza_jvm.visual_vm;

import static sda_pizza_jvm.Input.getInt;

public class Main {

    public static void main(String[] args) {

        MyReader loremReader = new LoremReader();
        Concatenate concatenate = new Concatenate(loremReader);

        System.out.println("do with Concatenate");
        getInt();
        long time = System.nanoTime();
        concatenate.withPlus();
        System.out.println("work time: "+(System.nanoTime()-time)/1000000);


        System.out.println();
        System.out.println("do with StringBuilder");
        getInt();
        time = System.nanoTime();
        concatenate.withBuilder();
        System.out.println("work time: "+(System.nanoTime()-time)/1000000);
        getInt();
    }
}
