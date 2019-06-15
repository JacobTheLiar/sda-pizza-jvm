package sda_pizza_jvm;

import java.util.Scanner;

public class Input {

    public static int getInt(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print(">");
            if(scanner.hasNextInt()){
                int value = scanner.nextInt();
                return value;
            } else {
                System.out.println("fail! try again.");
            }
            scanner.nextLine();
        }
    }
}
