package app.ex1;

import app.ex1.models.*;

public class Testare1 {

    public static void ruleaza() {
        afiseaza(new Comanda("Ana", 10, 100, new LivrareExpress()));
        afiseaza(new Comanda("Ana", 10, 100, new LivrareGratuita()));
        afiseaza(new Comanda("Ana", 10, 100,  new LivrareStandard()));
        try {
            new Comanda("Ion", 0, 50, new LivrareStandard());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void afiseaza(Comanda comanda) {
        System.out.println(comanda.numeLivrare() + ": " + comanda.cost());
    }


}
