package app.ex3.models;

import java.util.ArrayList;
import java.util.List;

public class IncarcatorUtilizatori {

    List<Fabrica> arrFabrici = new ArrayList<>();

    public IncarcatorUtilizatori(List<Fabrica> arrFabrici){
        if(arrFabrici == null || arrFabrici.isEmpty()){
            throw new IllegalArgumentException("Minimum 1 factory required.");
        }

        this.arrFabrici=arrFabrici;
    }

    public List<Utilizator> incarca(List<String> linii) {
        List<Utilizator> utilizatori = new ArrayList<>();

        for (String linie : linii) {
            String[] campuri = linie.split(",");
            boolean gasit = true;

            for(Fabrica fab:arrFabrici){

                if (fab.getTip().equals(campuri[0])){

                    Utilizator user = fab.creeaza(campuri);
                    utilizatori.add(user);
                    gasit = false;      //stocam variabila daca potrivirea este gasita, nu se mai schimba pe true chiar daca urmatorul element in loop nu se potriveste
                }

            }
            if (gasit){
                throw new IllegalArgumentException("Unknown user type: " + campuri[0]);
            }
        }

        return utilizatori;
    }
}
