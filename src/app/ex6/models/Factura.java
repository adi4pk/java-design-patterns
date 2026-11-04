package app.ex6.models;

public class Factura {

    private final int numar;
    private Comanda comanda;

    public Factura(Comanda comanda){
        this.numar = GeneratorNumere.getInstance().urmatorul();
        this.comanda = comanda;
    }

    public String descriere(){
        return "Factura #" + numar + " pentru comanda #" + comanda.getNumar();
    }
}
