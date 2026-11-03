package app.ex3.models;

public class FabricaProfesor implements Fabrica{

    public FabricaProfesor(){

    }


    public String getTip(){
        return "PROFESOR";
    }


    public Utilizator creeaza(String[] campuri){

        return new Profesor(campuri[1], campuri[2], campuri[3]);

    }

}
