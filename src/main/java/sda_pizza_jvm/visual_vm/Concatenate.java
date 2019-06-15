package sda_pizza_jvm.visual_vm;

public class Concatenate {


    private final MyReader reader;

    public Concatenate(MyReader reader) {

        this.reader = reader;
    }


    public String withPlus(){
        reader.reset();
        String result = "";

        String sb;
        while ((sb = reader.readLine()) != null)
            result += sb;

        return result;
    }

    public String withBuilder(){
        reader.reset();
        StringBuilder sb = new StringBuilder();

        String s;
        while ((s = reader.readLine()) != null)
            sb.append(s);

        return sb.toString();
    }


}
