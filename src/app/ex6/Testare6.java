package app.ex6;

import app.ex6.models.Comanda;
import app.ex6.models.Factura;
import app.ex6.models.GeneratorNumere;
import app.ex6.models.Retur;

public class Testare6 {

    public static void ruleaza() {

        Comanda ana = new Comanda("Ana");
        Comanda ion = new Comanda("Ion");
        Retur retur = new Retur(ana);
        System.out.println(ana.descriere());
        System.out.println(ion.descriere());
        System.out.println(retur.descriere());
        Comanda maria = new Comanda("Maria");
        System.out.println(maria.descriere());

        Factura factura1 = new Factura(maria);
        Factura factura2 = new Factura(ion);
        System.out.println(factura1.descriere());
        System.out.println(factura2.descriere());
    }
}
