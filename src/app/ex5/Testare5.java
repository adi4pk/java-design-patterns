package app.ex5;

import app.ex5.models.Comanda;

public class Testare5 {

    public static void ruleaza() {

        Comanda simpla = new Comanda.Builder().
                setClient("Ana")
                .setAdresa("Str. Florilor")
                .setExpress(false)
                .setCadou(false).build();

        Comanda cuCupon = new Comanda.Builder()
                .setClient("Ion")
                .setAdresa("Bd. Unirii 10")
                .setNota("Suna la interfon")
                .setCupon("TOAMNA10")
                .setExpress(false)
                .setCadou(false).build();

        Comanda completa = new Comanda.Builder()
                .setClient("Maria")
                .setAdresa("Str. Mare 1")
                .setNota("La multi ani!")
                .setCupon("CADOU5")
                .setExpress(true)
                .setCadou(true).build();


//        Comanda simpla = new Comanda("Ana", "Str. Florilor 5", null, null, false, false);
        System.out.println(simpla.descriere());
//        Comanda cuCupon = new Comanda("Ion", "Bd. Unirii 10", "Suna la interfon",
//                "TOAMNA10", false, false);
        System.out.println(cuCupon.descriere());
//        Comanda completa = new Comanda("Maria", "Str. Mare 1", "La multi ani!",
//                "CADOU5", true, true);
        System.out.println(completa.descriere());
        try {
            new Comanda.Builder().setClient("Dan").build();
//                    ("Dan", null, null, null, false, false);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            new Comanda.Builder().setClient("Dan").setAdresa("Str. Lunga 2").setCadou(true).build();
//            new Comanda("Dan", "Str. Lunga 2", null, null, false, true);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
