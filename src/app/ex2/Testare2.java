package app.ex2;

import app.ex2.models.*;

public class Testare2 {

    public static void ruleaza() {
        Comanda comanda = new Comanda("Ana");

        Observer jurnalObs = new JurnalLivrare();
        Observer serviciuEmail = new NotificatorEmail();
        Observer panouDepo = new PanouDepozit();

        comanda.aboneazaObserver(jurnalObs);
        comanda.aboneazaObserver(serviciuEmail);

        comanda.schimbaStare("Expediata");
        comanda.schimbaStare("Expediata");


        comanda.aboneazaObserver(panouDepo);
        comanda.schimbaStare("Livrata");
        System.out.println("Stare finala: " + comanda.getStare());
        try {
            comanda.schimbaStare(" ");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
