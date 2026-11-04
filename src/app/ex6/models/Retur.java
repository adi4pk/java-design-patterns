package app.ex6.models;

public class Retur {
    private final int numar;
    private final Comanda comanda;

    public Retur(Comanda comanda) {
        this.comanda = comanda;
        this.numar = GeneratorNumere.getInstance().urmatorul();
    }

    public String descriere() {
        return "Retur #" + numar + " pentru comanda #" + comanda.getNumar();
    }
}
