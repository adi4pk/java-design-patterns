package app.ex6.models;

public class GeneratorNumere {

    private static final GeneratorNumere INSTANTA = new GeneratorNumere();
    private int ultimul = 1000;


    private GeneratorNumere(){

    }


    public static GeneratorNumere getInstance(){
        return INSTANTA;
    }

    public int urmatorul() {
        ultimul++;
        return ultimul;
    }

    public int getNumar(){
        return ultimul;
    }
}
