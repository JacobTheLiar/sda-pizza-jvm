package sda_pizza_jvm.visual_vm;

import java.io.BufferedReader;
import java.io.FileReader;

public class LoremReader implements MyReader {


    private final String FILE_PATH = "c:\\Users\\Jakub\\IdeaProjects\\sdapizzajvm\\lorem.txt";
    private BufferedReader file;



    public LoremReader() {
        reset();
    }

    @Override
    public String readLine(){
        try {
            return file.readLine();
        } catch (Exception e) {
            return "";
        }
    }

    @Override
    public void reset() {
        try {
            file = new BufferedReader(new FileReader(FILE_PATH));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
