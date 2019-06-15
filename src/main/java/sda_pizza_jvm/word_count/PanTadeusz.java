package sda_pizza_jvm.word_count;

import sda_pizza_jvm.visual_vm.MyReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class PanTadeusz implements MyReader {
    private final String FILE_PATH = "c:\\Users\\Jakub\\IdeaProjects\\sdapizzajvm\\pan-tadeusz.txt";
    private BufferedReader file;



    public PanTadeusz() {
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
