package app.ex3.models;

public class FabricaStudent implements Fabrica {

    public FabricaStudent(){

    }

    public String getTip(){
        return "STUDENT";
    }

    public Utilizator creeaza(String[] campuri){


        return new Student(campuri[1], campuri[2], campuri[3]);

    }
}
